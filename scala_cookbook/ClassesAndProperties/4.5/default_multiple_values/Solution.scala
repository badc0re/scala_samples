

class Socket(val timeout: Int = 100, val port: Int = 8839){
    override def toString = s"$timeout and $port"

}

object Solution {
    def main(args: Array[String]){
        val s = new Socket(timeout=100, port=4444)
        println(s)
    }
}
