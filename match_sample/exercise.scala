


object Exercise{

  def main(args: Array[String]){
    var i = 1231
    val month = i match{
      case 1 => "January"
      case _ => "booooom!"
    }
    println(month)
  }
}
