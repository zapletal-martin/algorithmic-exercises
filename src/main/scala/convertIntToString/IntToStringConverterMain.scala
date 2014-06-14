package convertIntToString

import reverseWordOrder.reverseByRevertingTheWholeStringAndThenRevertingOrderOfCharsInEachWord.Reverter

object IntToStringConverterMain {
  def Run () = {
    val converter = new IntToStringConverter(new Reverter)
    converter.Convert(4321)
  }
}
