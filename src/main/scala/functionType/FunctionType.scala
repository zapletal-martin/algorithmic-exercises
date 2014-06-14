package functionType


/**
  * just a fun with higher order functions
  */
object FunctionType {
  val func : Int => Int => Int => Int = {
     x => (y => (z => x + y + z))
  }

  val func2 : (Int => Int) => Int = {
    (f) => f(1)
  }

  val func3 : Int => (Int => Int) = {
    x => y => y + x
  }

  val func4 : (Int => Int) => (Int => Int) = {
    f => f
  }

  val func5 : (Int => Int) => (Int => Int) = {
    f => x => f(x)
  }

  val func6 : (Int => Int) => (Int => Int) => Int = {
    f => g => f(g(5))
  }

  val func7 : ((Int => Int) => (Int => Int)) => Int = {
    f => f(_ + 1)(2)
  }

  /*def func2() : (Int => Int) => ((((Int, Int) => Int),Int) => Int) => Int = {
    1
  }*/

  def call() = {
    func(1)(2)(3)
  }

  def call2() = {
    func2(x => x + 1)
  }

  def call3() = {
    func3(2)(5)
  }

  def call4() = {
    func4(x => x + 1)(1)
  }

  def call5() = {
    func5(x => x + 5)(2)
  }

  def call6() = {
    func6(_ + 1)(_ + 2)
  }

  def call7() = {
    func7(f => x => f(x) * 2)
  }
}
