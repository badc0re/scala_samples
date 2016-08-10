

class Point(xc: Int, yc:Int){
  var x: Int = xc
  var y: Int = yc

  def move(mx: Int, my:Int){
    x = x + mx
    y = y + my
  }

  override def toString(): String = "(" + x + ". " + y + ")";

}

object ClassesSample{
  def main(args: Array[String]){
    // kind of constant
    val pt = new Point(1, 2) 
    println(pt)
    pt.move(2, 2)
    println(pt)
  }
}
