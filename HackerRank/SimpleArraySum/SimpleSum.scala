


object SimpleSum{

  def main(args: Array[String]){
    var IO = new java.util.Scanner(System.in)
    var n = IO.nextInt()
    var arr = new Array[Int](n); // Int's array with size
    var sumNumber = 0
    for (arr_i <-0 to n -1){ // for (0 to n-1)
      arr(arr_i) = IO.nextInt()
      sumNumber += arr(arr_i)
    }
    println(sumNumber)

  }

}
