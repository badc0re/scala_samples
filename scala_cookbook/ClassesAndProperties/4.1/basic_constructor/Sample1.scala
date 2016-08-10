// links: http://varaneckas.com/jad/

// var (mutable)
// val (immutable)

// one way of making a constructor
class Person(var name: String, var lastName: String){
    println("Constructor here!")

    // cannot be accessed
    private val HOME = System.getProperty("user.home")
    var age = 0 
    override def toString = s"$name, $lastName is $age years old"

    def printHome { println(s"HOME=$HOME") }
    // prints the overriden function toString
    // otherwise it will print the address
    def printFullName { println(this)}
}

object Solution{
    def main(args: Array[String]){
        val p = new Person("dame", "jovanoski")         

        p.printHome
        p.printFullName
        println(p.name)
        // it can change, not immutable (val)
        p.age = 10
        p.printFullName
    }
}
