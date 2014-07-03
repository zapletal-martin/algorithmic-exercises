package telephoneNumber

import org.specs2.mutable.Specification

class TelephoneNumberTest extends Specification {
  "Telephone number" should {
    lazy val result = new TelephoneNumber().allCombinationsOfWords(List(1,2))

    "Return all 9 possible combinations" in {
      result must have size(9)
    }

    "Return all combinations of words created from telephone number as on phone keyboard (2=>ABC, 3=>DEF, ..)" in {
      result must contain("AD")
      result must contain("AE")
      result must contain("AF")
      result must contain("BD")
      result must contain("BE")
      result must contain("BF")
      result must contain("CD")
      result must contain("CE")
      result must contain("CF")
    }
  }
}
