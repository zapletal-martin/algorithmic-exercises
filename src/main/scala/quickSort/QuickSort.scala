package quickSort

class QuickSort {

  //Not an in situ algorithm. Let's implement in place version too!
  def sort(data: List[Int]): List[Int] = {
    data match {
      case Nil => Nil
      case x :: xs => sort(xs.filter(_ < x)) ::: List(x) ::: sort(xs.filter(_ > x))
    }
  }
}
