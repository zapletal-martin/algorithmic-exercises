package binarySearchOnSortedArray

class BinarySearchRecursive {
  def search(arr: Array[Int], toFind: Int): Int = {
    val curr = arr.length / 2

    arr(curr) compare toFind match {
      case  0 => curr
      case  1 => search(arr.take(curr), toFind)
      case -1 => 1 + curr + search(arr.takeRight(arr.length - curr - 1), toFind)
    }
  }
}
