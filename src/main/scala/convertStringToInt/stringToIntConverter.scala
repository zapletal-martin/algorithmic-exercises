package convertStringToInt

class stringToIntConverter {
  def Convert (input : String) : Int = {
    var base = 1
    val multiplier = 0

    /*for (i <- (input.length - 1).to(0).by(-1)) {
      result = result + base * Integer.parseInt(input.charAt(i).toString) //TODO: ascii conversion
      base *= 10
    }*/

    (0 to input.length - 1).foldLeft[Int](0)((cumm, curr) => {
      cumm * 10 + Integer.parseInt(input.charAt(curr).toString);
    })
    //result
  }
}
