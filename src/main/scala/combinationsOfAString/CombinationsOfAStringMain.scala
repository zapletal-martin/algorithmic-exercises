package combinationsOfAString

object CombinationsOfAStringMain {
  def Run () = {
    val comb = new CombinationsOfAString()

    val res = comb.combine("cat")

    System.out.println(res)

    //"ca" the same as "ac"
    assert(res.length == 7)
    assert(res.exists(_ == "c"))
    assert(res.exists(_ == "a"))
    assert(res.exists(_ == "t"))
    assert(res.exists(_ == "ca"))
    assert(res.exists(_ == "ct"))
    assert(res.exists(_ == "ac"))
    assert(res.exists(_ == "cat"))
  }
}
