package reverseWordOrder.reverseByReadingWordsAndWritingThemInReversedOrderToOutputBuffer

class WordTokenizer (sentenceToReverse : String) extends Iterator [String] {
  private var position : Int = 0;
  private val buffer : Array [Char] = new Array[Char](sentenceToReverse.length); //TODO: we can probably improve mem efficiency by reducing this len just for one word at expense of computational compl

  override def hasNext: Boolean = {
    position != sentenceToReverse.length;
  }

  override def next(): String = {
    var i = 0
    var c = 'r'

    while (c != ' ' && hasNext) {
      c = sentenceToReverse.charAt(position)
      buffer(i) = c
      i += 1
      position += 1
    }

    new String(buffer).substring(0, i)
  }
}
