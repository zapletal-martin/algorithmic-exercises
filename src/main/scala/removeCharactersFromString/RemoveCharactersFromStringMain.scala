package removeCharactersFromString

object RemoveCharactersFromStringMain {
  def Run = {
    val underTest = new RemoveCharactersFromString();
    underTest.removeChars("Battle of the Vowels: Hawaii vs. Grozny", "aeiou");

    }
}
