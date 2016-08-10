

class Person private(val name: String){
    override def toString = s"$name"
}

// cannot take parameters
object Person {
    val person = new Person("abdula")
    def getInstance = person
}


object Solution { 
    def main(args: Array[String]){
        println(Person.getInstance)
    }
}
