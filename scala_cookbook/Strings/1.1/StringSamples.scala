



object StringSamples{
  def main(args: Array[String]){
    val hw = "hello world";
    println(hw)
    val hw1 = "hello" + " world"
    println(hw1)
    // print characters separately
    hw1.foreach(println)

    for (c <- hw1)println(c)
    hw1.getBytes.foreach(println)
    
    var result = hw1.filter(_ != 'l')
    result.foreach(print)

    println()

    // drop removes the first two
    // take just takes the first two, removes the rest
    var result1 = hw.drop(2).take(2).capitalize
    println(result1)
    
    val a = "hello".take(2)
    val b = "hello".drop(2)

    println(a == b)

  }
}
