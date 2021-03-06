package convertIntToString

import reverseWordOrder.reverseByRevertingTheWholeStringAndThenRevertingOrderOfCharsInEachWord.Reverter

class IntToStringConverter () {
  val reverter = new Reverter()
  /*divide or modulo
  732/100=7, 732-700 -> 32/10=3, 32 - 30 ....
  or 732 % 10 = 2, 732/10 = 73, 73 % 10 a revert */
  def convert(input: Int): String = {
    var runningProduct: Int = input
    var position = 0
    val buffer = new Array[Char](Int.MaxValue.toString.length)

    while (runningProduct != 0) {
      val current = runningProduct % 10
      runningProduct = runningProduct / 10

      buffer(position) = current.toString.charAt(0)
      position += 1
    }

    reverter.revert(buffer, 0, position - 1)
    new String(buffer.filter(c => c != '\u0000'))
  }
}
