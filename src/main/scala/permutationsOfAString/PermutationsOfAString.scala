package permutationsOfAString

trait Conversions {
  implicit def charToList(c: Char) = List(c)
}

class PermutationsOfAString extends Conversions {
  def mutate(input: String): Seq[String] = {
    input match {
      case "" => List("")
      case _@a => a.flatMap(c => mutate(a.diff(c)).map(c + _))
    }
  }
}
