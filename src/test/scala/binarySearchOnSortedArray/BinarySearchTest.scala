package binarySearchOnSortedArray

import org.specs2.mutable._

class BinarySearchTest extends Specification {
  "Iterative binary search" should {
    "Find number 14 on index 13" in {
      new BinarySearchIterative().Search((1 to 20).toArray, 14) must be_==(13)
    }
  }

  "Recursive binary search" should {
    "Find number 14 on index 13" in {
      new BinarySearchRecursive().Search((1 to 20).toArray, 14) must be_==(13)
    }
  }
}
