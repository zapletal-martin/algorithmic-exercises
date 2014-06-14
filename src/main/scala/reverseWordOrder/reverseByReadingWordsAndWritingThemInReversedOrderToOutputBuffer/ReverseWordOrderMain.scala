package reverseWordOrder.reverseByReadingWordsAndWritingThemInReversedOrderToOutputBuffer

object ReverseWordOrderMain {
  def Run () = {
    val reverter = new ReverseSentence()

    reverter.revert("Hello, how are you doin?")
  }
}
