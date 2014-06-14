package binarySearchOnSortedArray

class binarySearchRecursive {
  def Search(arr: Array[Int], search: Int): Int = {
    val curr = arr.length / 2

    arr(curr) compare search match {
      case  0 => curr
      case  1 => Search(arr.take(curr), search)
      case -1 => 1 + curr + Search(arr.takeRight(arr.length - curr - 1), search)
    }
  }
}
