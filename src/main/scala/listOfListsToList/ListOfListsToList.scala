package listOfListsToList

class ListOfListsToList {
  def unwind[A](input: List[List[A]]): List[A] = {
    input flatten
  }
}
