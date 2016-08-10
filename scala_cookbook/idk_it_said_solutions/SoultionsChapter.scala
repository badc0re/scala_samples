

object Solution{

  def main(args: Array[String]){
      for(i <- Array(1,2,3)) println(i)
      for(i <- Array(1,2,3)) yield i * 2
      Array(1,2,3).map(_ * 2)
      val nums = List(1,2,3,4,5).filter(_ <3)
      // _ (underscore) is a placeholder for each element
      println(nums)
      val nubs = List(1,2,3,4,5).filter(_ < 3).map(_ * 2)
      println(nubs)
  }

}
