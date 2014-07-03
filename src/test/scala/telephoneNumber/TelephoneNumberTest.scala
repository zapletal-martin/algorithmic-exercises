package telephoneNumber

import org.specs2.mutable.Specification

class TelephoneNumberTest extends Specification {
  "Telephone number" should {
    lazy val result = new TelephoneNumber().allCombinationsOfWords(List(1,2,3))

    "Return all 9 possible combinations" in {
      result must have size(27)
    }

    "Return all combinations of words created from telephone number as on phone keyboard (2=>ABC, 3=>DEF, ..)" in {
      result must contain("ADG")
      result must contain("ADH")
      result must contain("ADI")
      result must contain("AEG")
      result must contain("AEH")
      result must contain("AEI")
      result must contain("AFG")
      result must contain("AFH")
      result must contain("AFI")

      result must contain("BDG")
      result must contain("BDH")
      result must contain("BDI")
      result must contain("BEG")
      result must contain("BEH")
      result must contain("BEI")
      result must contain("BFG")
      result must contain("BFH")
      result must contain("BFI")

      result must contain("CDG")
      result must contain("CDH")
      result must contain("CDI")
      result must contain("CEG")
      result must contain("CEH")
      result must contain("CEI")
      result must contain("CFG")
      result must contain("CFH")
      result must contain("CFI")
    }
  }
}
