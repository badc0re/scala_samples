

class C{
  var acc = 0
  def minc = {acc += 1} // regular increment in a function
  val finc = { () => acc += 1} // makes it a function
}

object  SimpleClass{
  def main(args: Array[String]){
    val c = new C
    println(c)
    println(c.acc)
    c.minc
    println(c.acc)
    println(c.finc())
    println(c.acc)
    println(c.finc())
    println(c.acc)
    println(c.finc())
    println(c.acc)
    
  }
}
