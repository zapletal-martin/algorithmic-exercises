package kevinBacon

import org.specs2.mutable.Specification
import convertStringToInt.StringToIntConverter

class KevinBaconTest extends Specification {
  "Kevin bacon calculation" should {
    "Should find the shortest path from Kevin Bacon to given actor" in {
      val kev = new KevinBacon();
      val _2 = new ActorNode("2");
      val _3 = new ActorNode("3");
      val _4 = new ActorNode("4");
      val _5 = new ActorNode("5");
      val _6 = new ActorNode("6");
      val _7 = new ActorNode("7");
      val _8 = new ActorNode("8");
      val _9 = new ActorNode("9");
      val _10 = new ActorNode("10");
      val _11 = new ActorNode("11");
      val _12 = new ActorNode("12");
      val _13 = new ActorNode("13");
      val _14 = new ActorNode("14");
      val _15 = new ActorNode("15");
      val _16 = new ActorNode("16");
      val _17 = new ActorNode("17");
      val _18 = new ActorNode("18");
      val _19 = new ActorNode("19");

      kev.addCoActor(_2);
      kev.addCoActor(_3);
      kev.addCoActor(_4);

      _2.addCoActor(_3);
      _2.addCoActor(_5);

      _3.addCoActor(_15);

      _5.addCoActor(_7);
      _5.addCoActor(_12);

      _12.addCoActor(_14);

      _14.addCoActor(_15);

      _15.addCoActor(_19);

      kev.setBaconNumber();

      _19.BaconNumber must beEqualTo(3)
    }
  }
}
