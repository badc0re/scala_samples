

object MultiLineStrings{
  def main(args: Array[String]){
    val str = """This
    is a derped string
    bro!  
    """
    println(str)
    val str1 = """This
    #is a derped string
    #bro!
    """
    // it remove a character
    println(str1.stripMargin('#'))
    val str2 = """This
    is a derped string
    bro!
    """
    println(str2.replaceAll("\n", " "))

    val str3 = """This, is, a, string."""
    str3.split(",").foreach(println)
  }
}






