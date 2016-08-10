

abstract class Shape{
  def getArea(): Int
}


class Circle(r: Int) extends Shape{
  def getArea(): Int = { r * r * 3}

}


object AbstractSimple{
  def main(arg: Array[String]){
    val cls = new Circle(2)
    println(cls.getArea())

  }
}
