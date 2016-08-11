

case class Address(city: String, state: String){
    override def toString = s"$city @ $state"
}

case class Role(role: String){
    override def toString = s"$role"
}

class Person(var name: String, var address: Address){
    def this(name: String){
        this(name, null)
        address = null
    }
}

class Employee(name: String, role: Role, address: Address)
extends Person(name, address){
    def this(name: String){
        this(name, null, null)
    }
    def this(name: String, role: Role){
        this(name, role, null)
    }
    def this(name: String, address: Address){
        this(name, null, address)
    }
    override def toString = s"$name and $address and $role"
}

object Solution extends App{
    val addr = Address("prilep", "prilep")
    val r = Role(role="Drvar")
    val e = new Employee(name="dame", role=r, address=addr)
    println(e)
}
