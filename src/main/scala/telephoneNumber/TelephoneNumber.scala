package telephoneNumber

class TelephoneNumber {
  def getLetterAtPosition(number: Int, position: Int): String = {
    assert(number >= 1 && number <= 9 && position >= 0 && position <= 2)
    (62 + number * 3 + position).toChar.toString
  }

  def allCombinationsOfWords(phoneNumber: List[Int]): List[String] = {
    def allCombinationsOfWords(digit: Int): List[String] = {
      (0 to 2).flatMap(i =>
        if(digit == phoneNumber.length - 1)
          List(getLetterAtPosition(phoneNumber(digit), i))
        else
          allCombinationsOfWords(digit + 1).map(getLetterAtPosition(phoneNumber(digit), i) + _)
        ).toList
    }

    allCombinationsOfWords(0)
  }
}
