package binarySearchOnSortedArray

import util.control.Breaks._

class binarySearchIterative {
  def Search(arr: Array[Int], search: Int): Int = {
    var start = 0
    var end = arr.length - 1
    var mid = end / 2

    breakable{
      while (true) {
        search compare arr(mid) match {
          case 0 =>
            break
          case  1 =>
            start = mid + 1
          case -1 =>
            end = mid - 1
        }

        mid = (start + end) / 2
      }
    }

    mid
  }
}
