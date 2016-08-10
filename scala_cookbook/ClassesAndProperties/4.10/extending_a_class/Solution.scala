

class Person(name: String, address: Address){
    override def toString = if (address == null) name else s"$name @ $address"
}


class Employee(name: String, address: Address, var age: Int)
extends Person(name, address){

}

case class Address(city: String, state: String){
    override def toString  = s"$city, $state"
}

object Solution extends App{
    val p = new Employee(name="dame", address=Address("prilep", "prilepska"), age=26)
    println(p)
    // no "var" in front of name and address
    // no mutator and accessor
    // will fail
    p.name = "bla"
}
