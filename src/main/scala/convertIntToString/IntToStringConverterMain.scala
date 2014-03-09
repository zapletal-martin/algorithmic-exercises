package main.scala.convertIntToString

import main.scala.reverseWordOrder.reverseByRevertingTheWholeStringAndThenRevertingOrderOfCharsInEachWord.Reverter

object IntToStringConverterMain {
  def Run () = {
    val converter = new IntToStringConverter(new Reverter)
    converter.Convert(4321)
  }
}
