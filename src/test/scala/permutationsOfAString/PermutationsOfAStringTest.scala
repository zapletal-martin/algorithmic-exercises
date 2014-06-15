package permutationsOfAString

import org.specs2.mutable.Specification

class PermutationsOfAStringTest extends Specification {
  "Permutations of a string" should {
    lazy val result = new PermutationsOfAString().mutate("cat")

    s"Return 6 as number of permutations of a string ${"cat"}" in {
      result must have size(6)
    }

    s"Return all permutations of a string ${"cat"}" in {
      result must contain("cat")
      result must contain("act")
      result must contain("tac")
      result must contain("tca")
      result must contain("cta")
      result must contain("atc")
    }
  }
}
