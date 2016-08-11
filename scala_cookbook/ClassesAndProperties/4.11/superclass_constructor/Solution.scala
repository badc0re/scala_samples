
/*
You can control the superclass constructor that’s
called by the primary constructor in a subclass,
but you can’t control the superclass constructor
that’s called by an auxiliary constructor in the subclass.
*/

// primary constructor
class Animal(var name: String, var age: Int){
    // auxiliary constructor
    def this(name: String){
        this(name, 0)
    }


    override def toString = s"$name is $age years old"
}

class Dog(name: String, age: Int) extends Animal(name, age){
    println("Dog constructor")

    // auxiliary constructor
    // Won't work without this aux constructor
    /*
    def this(name: String){
        this(name, 0)
    }
    */
}

object SuperClass extends App{
    val d = new Dog("dame")
    println(d)
}
