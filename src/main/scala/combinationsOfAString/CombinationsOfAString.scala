package combinationsOfAString

class CombinationsOfAString {
  def combine(input: String): List[String] = combine(input.toCharArray.toList)

  def combine(input: List[Char]): List[Char] = {
    input match {
      case x :: xs => x :: all(xs) ::: combine(xs)
    }

    val result = collection.mutable.ListBuffer[String]()

    result
  }

  def all(input: List[Char]): List[String] = {

  }
}
