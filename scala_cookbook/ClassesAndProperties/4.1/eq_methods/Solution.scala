

class Person {
    var name = ""
    override def toString = s"name = $name"
}


object Test extends App{
    val p = new Person
    p.name = "Dame"
    println(p)

    p.name_$eq("Bicth")
    println(p)
}

