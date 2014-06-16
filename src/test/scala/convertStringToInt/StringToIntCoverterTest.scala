package convertStringToInt

import org.specs2.mutable.Specification

class StringToIntCoverterTest extends Specification {
  "String to int converter" should {
    s"Convert string ${"1234"} to integer with value 1234" in {
      new StringToIntConverter().convert("1234") must beEqualTo(1234)
    }
  }
}
