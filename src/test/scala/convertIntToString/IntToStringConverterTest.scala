package convertIntToString

import org.specs2.mutable.Specification

class IntToStringConverterTest extends Specification {
  "Int to string converter" should {
    s"Convert integer 4321 to string ${"4321"}" in {
      new IntToStringConverter().convert(4321) must beEqualTo("4321")
    }
  }
}
