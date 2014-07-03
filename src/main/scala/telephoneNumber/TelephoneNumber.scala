package telephoneNumber

class TelephoneNumber {
  def getLetterAtPosition(number: Int, position: Int): String = {
    assert(number >= 1 && number <= 9 && position >= 1 && position <= 3)
    (61 + number * 3 + position).toChar.toString
  }

  def allCombinationsOfWords(phoneNumber: List[Int]): List[String] = {
    def allCombinationsOfWords(digit: Int): List[String] = {
      (0 to 2).flatMap(i =>
        if(digit == phoneNumber.length) {
          List()
        } else {
          allCombinationsOfWords(digit + 1).map(getLetterAtPosition(phoneNumber(digit), i) + _)
        }).toList
    }

    allCombinationsOfWords(0)
  }
}
