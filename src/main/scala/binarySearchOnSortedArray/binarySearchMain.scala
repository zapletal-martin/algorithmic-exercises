package binarySearchOnSortedArray

object binarySearchMain {
  def Run() = {
    assert(new binarySearchIterative().Search((1 to 20).toArray, 14) == 13)
    assert(new binarySearchRecursive().Search((1 to 20).toArray, 14) == 13)
  }
}
