package binarySearchOnSortedArray

object BinarySearchMain {
  def Run() = {
    assert(new BinarySearchIterative().Search((1 to 20).toArray, 14) == 13)
    assert(new BinarySearchRecursive().Search((1 to 20).toArray, 14) == 13)
  }
}
