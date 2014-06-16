package reverseWordOrder

import reverseWordOrder.reverseByReadingWordsAndWritingThemInReversedOrderToOutputBuffer.SentenceReverter
import org.specs2.mutable.Specification

class ReverseWordOrderTest extends Specification {
  "Reverse word order by reading words and writing them in reversed order to output buffer" should {
    s"Reverse ${"Hello, how are you doin?"} sentence to ${"doin?you are how Hello, "}" in {
      new reverseWordOrder.reverseByReadingWordsAndWritingThemInReversedOrderToOutputBuffer.SentenceReverter()
        .revert("Hello, how are you doin?") must beEqualTo("doin?you are how Hello, ")
    }
  }

  "Reverse word order by reverting the whole string and then reverting order of chars in each word" should {
    s"Reverse ${"Hello, how are you doin?"} sentence to ${"doin?you are how Hello, "}" in {
      new reverseWordOrder.reverseByRevertingTheWholeStringAndThenRevertingOrderOfCharsInEachWord.SentenceReverter()
        .revert("Hello, how are you doin?") must beEqualTo("doin?you are how Hello, ")
    }
  }
}
