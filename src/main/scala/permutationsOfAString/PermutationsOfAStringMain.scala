package main.scala.permutationsOfAString

object PermutationsOfAStringMain {
  def Run () = {
    val perm = new PermutationsOfAString()

    val res = perm.mutate("cat");

    System.out.println(res)

    assert(res.length == 6)
    assert(res.exists(_ == "cat"))
    assert(res.exists(_ == "act"))
    assert(res.exists(_ == "tac"))
    assert(res.exists(_ == "tca"))
    assert(res.exists(_ == "cta"))
    assert(res.exists(_ == "atc"))
  }
}
