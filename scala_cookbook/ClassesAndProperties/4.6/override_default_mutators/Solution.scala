// override default accessor and mutators

// by scala conventions

class Person(private var _name: String){
    def name = _name // accessor

    // ako ne e definirano nemozi p1.name = "Stojan"
    def name_= (aName: String) { _name = aName } // mutator
}

object Solution{
    def main(args: Array[String]){
        val p1 = new Person("Dame")
        println(p1.name)

        p1.name = "Stojan"
        println(p1.name)
    }
}
