package listOfListsToList;

import org.specs2.mutable.Specification

class ListOfListsToListTest extends Specification  {

  "List of lists to list" should {
    lazy val result = new ListOfListsToList().unwind[Int](List(List(1,2,3), List(4,5), List(6)))

    "Return a list containing elements from all the input lists" in {
      result must have size (6)

      result must contain(1)
      result must contain(2)
      result must contain(3)
      result must contain(4)
      result must contain(5)
      result must contain(6)
    }
  }
}
