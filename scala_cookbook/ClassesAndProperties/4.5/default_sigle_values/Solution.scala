// default value

class Socket(val timeout: Int = 1000){
    override def toString() = s"$timeout"
}

object Solution{
    def main(args: Array[String]){
        val t = new Socket()
        println(t)
        val t1 = new Socket(5000)
        println(t1)
        // with named parameters
        val t2 = new Socket(timeout=5000)
        println(t2)
    }
}
