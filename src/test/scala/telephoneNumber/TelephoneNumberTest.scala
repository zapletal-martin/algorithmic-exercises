package telephoneNumber

import org.specs2.mutable.Specification

class TelephoneNumberTest extends Specification {
  "Telephone number" should {
    "Return all combinations of words created from telephone number as on phone keyboard (2=>ABC, 3=>DEF, ..)" in {
      new TelephoneNumber().allCombinationsOfWords()

    }
  }
}
