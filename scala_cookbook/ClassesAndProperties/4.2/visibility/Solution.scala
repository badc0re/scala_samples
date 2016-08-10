
class PersonA(var name: String)
class PersonB(val name: String)
class PersonC(name: String)

object Solution{
    
    def main(args: Array[String]){
        val p = new PersonA("dame")
        println(p.name)
        p.name = "aha"
        println(p.name)

        // cannot be reassigned
        val p1 = new PersonB("boris")
        println(p1.name)
        p1.name = "of boli"
        println(p1.name)

        // very restricted, idk how to access it :)
        val p2 = new PersonC("bla")
        println(p2.name)
    }
}
