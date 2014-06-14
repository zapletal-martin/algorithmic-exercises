package functionType

import org.specs2.mutable.Specification

class FunctionTypeTest extends Specification {
  "Function type examples" should {
    "Return correct values for higher order functions calls" in {
      FunctionType.call() must be_==(6)
      FunctionType.call2() must be_==(2)
      FunctionType.call3() must be_==(7)
      FunctionType.call4() must be_==(2)
      FunctionType.call5() must be_==(7)
      FunctionType.call6() must be_==(8)
      FunctionType.call7() must be_==(6)
    }
  }
}
