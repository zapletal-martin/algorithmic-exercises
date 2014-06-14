package functionType

object FunctionTypeMain {
  def Run () = {
    assert(FunctionType.call() == 6)
    assert(FunctionType.call2() == 2)
    assert(FunctionType.call3() == 7)
    assert(FunctionType.call4() == 2)
    assert(FunctionType.call5() == 7)
    assert(FunctionType.call6() == 8)
    assert(FunctionType.call7() == 6)
  }
}
