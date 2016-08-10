

object Loop{
  def main(args: Array[String]){

    val a = Array("dame", "kristina", "derp")
    for (e <- a) println(e)

    // multiline loop block
    println("%")
    for (e <- a){
        val s = e.toUpperCase
        println(s)
    }
    println("%")
    val newArr = for (e <- a) yield e.toUpperCase
    newArr.foreach(println)

    // multiline loop to variable
    println("%")
    val newArr1 = for(e <-a) yield{
      e.toUpperCase
    }
    newArr1.foreach(println)

    println("%")
    val str = "bananer"
    for (i <- 0 until str.length){
      println(s"$i is of ${str(i)}")
    }
    // with "if" in the loop
    
    println("%")
    for(i <- 0 until str.length if i < 4){
        println(s"$i is of ${str(i)}")
    }
  }
}
