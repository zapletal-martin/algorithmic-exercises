package removeCharactersFromString

import org.specs2.mutable.Specification

class RemoveCharactersFromStringTest extends Specification {
  "Remove characters from a string" should {

    s"Return string ${"Bttl f th Vwls: Hw vs. Grzn"} after stripping a, e, i, o, u, y characters from ${"Battle of the Vowels: Hawaii vs. Grozny"}" in {
      new RemoveCharactersFromString()
        .removeChars("Battle of the Vowels: Hawaii vs. Grozny", "aeiouy")
        .must(be_==("Bttl f th Vwls: Hw vs. Grzn"))
    }
  }
}
