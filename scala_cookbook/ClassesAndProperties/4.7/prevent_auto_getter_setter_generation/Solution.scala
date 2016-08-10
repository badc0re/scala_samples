
// a class field with var, it has automatically getter and setter

// a class field with val, it only has getter

// NOTE: no constructor !!!
class Stock{
    // getters and setter are generated
    // default variable type
    var delayedPrice: Double = _
    // field hidden from other classes
    private var currentPrice: Double = _
}

object Solution{
    def main(args: Array[String]){
        
        val s = new Stock()
        s.delayedPrice = 10
        // cannot be accessed 
        // s.currentPrice = 1000
        println(s.delayedPrice.getClass)
        // variable with type!
        var a: Int = 10
        println(a)
        // doesn't work
        // var b: Int = _
        // println(b)
    }
}

/*
Defining a field as private limits the field so it’s only available to instances of the same
class, in this case instances of the Stock class. To be clear, any instance of a Stock class
can access a private field of any other Stock instance.
*/
