package quickSort

import org.specs2.mutable.Specification

class QuickSortTest extends Specification {
  "Qicksort" should {
    lazy val result = new QuickSort().sort(List(3,4,2,1,8,6))

    s"Sort an array of integers" in {
      result must equalTo(List(1,2,3,4,6,8))
    }
  }
}
