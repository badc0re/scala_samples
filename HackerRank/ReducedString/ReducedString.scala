import scala.util.control._

object Solution{
  def main(args: Array[String]){
    val sc = new java.util.Scanner(System.in)
    var str = sc.nextLine()

    val loop = new Breaks;
    var currentLength = str.length
    var currentIdx = 0
    loop.breakable {
      while (true){
        // update length
        str = str.replaceAll(str(currentIdx).toString + str(currentIdx).toString, "")
        if (currentLength != str.length){
          currentLength = str.length
          currentIdx = 0
        } else{
          currentIdx += 1
          if (currentIdx == str.length){
            loop.break
          }
        }
        // condition
        if (str.length == 0){
          loop.break
        }
      }
    }
    if (str.length != 0){
      println(str)
    }
    else {
      println("Empty String")
    }
  }
}
