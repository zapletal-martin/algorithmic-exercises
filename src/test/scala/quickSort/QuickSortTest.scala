package quickSort

import org.specs2.mutable.Specification

class QuickSortTest extends Specification {
  "Qicksort" should {
    val underTest = new QuickSort();

    "Sort a random list of integers" in {
      underTest sort(List(3,4,2,1,8,6)) must equalTo(List(1,2,3,4,6,8))
    }

    "Sort an already sorted list of integers" in {
      underTest sort(List(1,2,3,4,5,6,7,8,9,10,11)) must equalTo(List(1,2,3,4,5,6,7,8,9,10,11))
    }

    "Sort a backwards sorted list of integers" in {
      underTest sort(List(10,9,8,7,6,5,4,3,2,1)) must equalTo(List(1,2,3,4,5,6,7,8,9,10))
    }
  }
}
