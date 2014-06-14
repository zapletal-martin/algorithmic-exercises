package kevinBacon

import scala.collection.immutable.Queue

class ActorNode (val ActorName : String) {
  val CoActors = scala.collection.mutable.Set[ActorNode]();
  var BaconNumber = -1;

  def AddCoActor (coActor : ActorNode) : Unit = {
    CoActors += coActor;
    coActor.CoActors += this;
  }
}

class KevinBacon () extends ActorNode ("Kevin Bacon") {
  BaconNumber = 0;

  def SetBaconNumber() : Unit = SetBaconNumber(Queue(this));

  def SetBaconNumber (queue : scala.collection.immutable.Queue[ActorNode]) : scala.collection.immutable.Queue[ActorNode] = {
    if(!queue.isEmpty) {
      val (currentActor, rest) = queue.dequeue;

      val restPlusUnprocessedCurrentCoActors = rest.enqueue(
        currentActor.CoActors.filter(x => x.BaconNumber < 0).toList
      );

      restPlusUnprocessedCurrentCoActors.foreach(x => {
        x.BaconNumber = currentActor.BaconNumber + 1;
      });

      SetBaconNumber(restPlusUnprocessedCurrentCoActors);
    }

    Queue();
  }
}
