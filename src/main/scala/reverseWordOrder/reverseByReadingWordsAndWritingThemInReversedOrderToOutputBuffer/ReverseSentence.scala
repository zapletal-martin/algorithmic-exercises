package reverseWordOrder.reverseByReadingWordsAndWritingThemInReversedOrderToOutputBuffer

class ReverseSentence {
  def revert (sentence : String) = {
    val wordTokenizer = new WordTokenizer(sentence)
    val buffer = new Array[Char](sentence.length)
    var position = sentence.length

    for(token <- wordTokenizer) {
      Array.copy(token.toCharArray, 0, buffer, position - token.length, token.length)
      position = position - token.length
    }

    new String (buffer)
  }
}
