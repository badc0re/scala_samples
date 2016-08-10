// default one constructor
case class Person(var name: String, var age: Int)

// extended like constructors
object Person{
    def apply() = new Person("<no name>", 0)
    def apply(name: String) = new Person(name, 0)
}

object Solution {
    def main(args: Array[String]){
        val p1 = Person()
        val p3 = Person("dame")
        val p4 = Person("dame", 123)

        println(p1)
        println(p3)
        println(p4)
    }
}

/*
A companion object is simply an object that’s defined in the same file
as a class , where the object and class have the same name. If you
declare a class named Foo in a file named Foo.scala , and then declare
an object named Foo in that same file, the Foo object is the compan‐
ion object for the Foo class.
A companion object has several purposes, and one purpose is that any
method declared in a companion object will appear to be a static
method on the object. See Recipe 6.6 for more information on creat‐
ing the equivalent of Java’s static methods, and Recipe 6.8 for exam‐
ples of how (and why) to define apply methods in a companion object.
*/
