package reverseWordOrder.reverseByRevertingTheWholeStringAndThenRevertingOrderOfCharsInEachWord

class Reverter {
  def Revert [T] (input : Array [T], start : Int, end : Int) = {
    var i = start
    var j = end

    while (i != end + 1 && j != start - 1 && i < j) {
      val buffer : T = input(i)
      input(i) = input(j)
      input(j) = buffer
      i += 1
      j -= 1
    }
  }
}
