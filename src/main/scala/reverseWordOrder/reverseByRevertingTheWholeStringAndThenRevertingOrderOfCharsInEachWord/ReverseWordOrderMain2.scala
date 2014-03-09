package main.scala.reverseWordOrder.reverseByRevertingTheWholeStringAndThenRevertingOrderOfCharsInEachWord

object ReverseWordOrderMain2 {
  def Run (sentence : String) = {
    val reverter = new Reverter()
    val sen = sentence.toCharArray
    var startIndex = 0

    reverter.Revert(sen, 0, sen.length - 1)

    for (endIndex <- 0 to sen.length - 1) {
      if(endIndex == sen.length - 1 || sen(endIndex + 1) == ' ') {
        reverter.Revert(sen, startIndex, endIndex)
        startIndex = endIndex + 1
      }
    }

    new String (sen)
  }
}
