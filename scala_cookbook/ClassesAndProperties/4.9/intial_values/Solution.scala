/*
When you get started in the Scala world,
you quickly learn that null values are a bad thing.

Scala makes it easy to replace null values with something better,
and that something better is what I call the Option/Some/None pattern (or idiom).

http://alvinalexander.com/scala/initialize-scala-variables-option-none-some-null-idiom
*/

case class Person(var username: String, var password: String){
    var age = 0
    var firstName = ""
    var lastName = ""
    var address = None: Option[Address]

}


case class Address(city: String, state: String, zip: String){
    override def toString = s"$city and $state and $zip"
}


object Solution extends App{
    val u = new Person("dame", "derpypass")
    u.address = Some(Address("prilep", "prilep", "7500"))
    println(u.address.getOrElse("Not Specified"))
    /*
    If the field hasn’t been assigned, address is a None , and calling foreach on it does no
    harm, the loop is just skipped over. If the address field is assigned, it will be a
    Some[Address] , so the foreach loop will be entered and the data printed.
    */
    u.address.foreach { a =>
        println(a.city)
        println(a.state)
        println(a.zip)
    }
}
