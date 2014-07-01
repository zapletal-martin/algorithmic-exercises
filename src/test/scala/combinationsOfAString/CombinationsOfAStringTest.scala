package combinationsOfAString

import org.specs2.mutable._

class CombinationsOfAStringTest extends Specification {

  "Combinations of a string" should {

    "Create 7 combinations of a string" in {
      new CombinationsOfAString().combine("cat") must have size(7)
    }

    "Create correct combinations of string 'cat'" in {
      lazy val result = new CombinationsOfAString().combine("cat")

      result must contain("c")
      result must contain("a")
      result must contain("t")
      result must contain("ca")
      result must contain("ct")
      result must contain("at")
      result must contain("cat")
    }
  }
}
