package kevinBacon

import scala.collection.immutable.Queue

class ActorNode (val ActorName: String) {
  val CoActors = scala.collection.mutable.Set[ActorNode]();
  var BaconNumber = -1;

  def addCoActor (coActor: ActorNode) : Unit = {
    CoActors += coActor;
    coActor.CoActors += this;
  }
}

class KevinBacon() extends ActorNode ("Kevin Bacon") {
  BaconNumber = 0;

  def setBaconNumber(): Unit = setBaconNumber(Queue(this));

  def setBaconNumber (queue: scala.collection.immutable.Queue[ActorNode]): scala.collection.immutable.Queue[ActorNode] = {

    //TODO: Ugly side effects - refactor
    def UpdateBaconNumber(toUpdate: scala.collection.mutable.Set[ActorNode], baconNumber: Int) = {
      toUpdate
        .filter(a => a.BaconNumber < 0 || a.BaconNumber > baconNumber)
        .foreach(_.BaconNumber = baconNumber);
    }

    if(!queue.isEmpty) {
      val (currentActor, rest) = queue.dequeue;

      val actorsToProcess = currentActor.CoActors.filter(a => a.BaconNumber < 0)
      UpdateBaconNumber(currentActor.CoActors, currentActor.BaconNumber + 1)

      setBaconNumber(rest.enqueue(actorsToProcess.toList));
    }

    Queue();
  }
}
