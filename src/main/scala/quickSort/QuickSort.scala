package quickSort

class QuickSort {
  def sort(data: List[Int]): List[Int] = {
    data match {
      case Nil => Nil
      case x :: xs => sort(xs.filter(_ < x)) ::: List(x) ::: sort(xs.filter(_ > x))
    }
  }
}
