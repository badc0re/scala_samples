
abstract class Pet(name: String){
    val greeting: String
    var age: Int
    def sayHello {println(greeting)}
    override def toString = s"I say $greeting, and i'm $age"
}

class Dog(name: String) extends Pet(name){
    val greeting = "Woof"
    var age = 2
}

class Cat(name: String) extends Pet(name){
    val greeting = "Meow"
    var age = 4
}

object AbstractFieldsDemo extends App{
    val dog = new Dog("Filo")
    val cat = new Cat("Morris")
    
    dog.sayHello
    cat.sayHello

    println(dog)
    println(cat)

}
