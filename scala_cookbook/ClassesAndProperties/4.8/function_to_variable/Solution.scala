
class Foo{
    val text = {
        var lines = ""
        try {
            // readlines from file
            lines = io.Source.fromFile("/etc/passwdb").getLines.mkString
        } catch {
            case e: Exception => lines = "Error happened"
        }
        lines
    }
}


object Solution extends App{
    val f = new Foo
    println(f.text)

}
