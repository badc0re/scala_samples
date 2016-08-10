

trait Car{
  val brand: String
}

trait Shiny{
  val shineRefraction: Int
}

class BMW extends Car with Shiny{
  val brand = "BMW"
  val shineRefraction = 33
}

object ShinyCar{
  def main(args: Array[String]){
    val bmw = new BMW()
    println(bmw.brand)
    println(bmw.shineRefraction)
  }


}
