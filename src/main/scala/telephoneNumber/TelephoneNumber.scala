package telephoneNumber

class TelephoneNumber {
  def getLetterAtPosition(number: Int, position: Int): Char = {
    assert(number >= 1 && number <= 9 && position >= 1 && position <= 3)
    (61 + number * 3 + position).toChar
  }

  def allCombinationsOfWords(phoneNumber: List[Int]): List[String] = {
    List()
  }
}
