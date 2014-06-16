package reverseWordOrder.reverseByRevertingTheWholeStringAndThenRevertingOrderOfCharsInEachWord

class SentenceReverter {
  def revert (sentence : String) = {
    val reverter = new Reverter()
    val sen = sentence.toCharArray
    var startIndex = 0

    reverter.revert(sen, 0, sen.length - 1)

    for (endIndex <- 0 to sen.length - 1) {
      if(endIndex == sen.length - 1 || sen(endIndex + 1) == ' ') {
        reverter.revert(sen, startIndex, endIndex)
        startIndex = endIndex + 1
      }
    }

    new String (sen)
  }
}
