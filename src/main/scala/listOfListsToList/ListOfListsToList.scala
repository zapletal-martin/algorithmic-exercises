package listOfListsToList

class ListOfListsToList {
  def unwind[A](input: List[List[A]]): List[A] = {
    input match {
      case Nil => Nil
      case x :: xs => x ::: unwind(xs)
    }
  }
}
