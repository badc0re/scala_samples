

object Numbers{
  def main(args: Array[String]){
      val b = BigInt("1")
      println(b)
      // generating random
      var r = scala.util.Random
      println(r.nextInt)
      // generating random in range
      println(r.nextInt(10))
      // print in line with step
      for(i<-1 to 100 by 5)println(i)
      // generate a array of 10 elements
      val x = (0 to 10).toArray
      x.foreach(print)
  }
}
