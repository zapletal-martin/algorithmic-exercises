package combinationsOfAString

class CombinationsOfAString {
  def combine(input: String): List[String] = combine(input.toCharArray.toList)

  def combine(input: List[Char]): List[String] = {
    input match {
      case list @ x :: xs => all("", list) ::: combine(xs)
      case one @ x :: Nil => all("", one)
    }
  }

  def all(prefix: String, input: List[Char]): List[String] = {
    (prefix, input) match {
      case (prefix, x :: Nil) => prefix + x.toString :: Nil
      case (prefix, list @ x :: xs) => prefix + x.toString :: all(prefix + x.toString, list)
    }
  }

  def cycle(prefix: String, input: List[Char], index: Int): List[String] =
    prefix + input(index) :: cycle(prefix, input, index + 1)

}
