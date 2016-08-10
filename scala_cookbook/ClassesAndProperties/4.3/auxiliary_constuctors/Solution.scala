
// auxiliary constructors (this)

// gives the user a different ways of creating objects

class Pizza(var crustSize: Int, var crustType: String){
    
    // one arg
    def this(crustSize: Int){
        this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
    }
    
    // one arg
    def this(crustType: String){
        this(Pizza.DEFAULT_CRUST_SIZE, crustType)
    }

    // zero args
    def this(){
        this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
    }

    override def toString = s"$crustSize inch pizza with $crustType crust"
}

object Pizza{
    val DEFAULT_CRUST_SIZE = 12
    val DEFAULT_CRUST_TYPE = "THIN"
}

object Solution{
    def main(args: Array[String]){
       val p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE) 
       val p2 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
       val p3 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
       val p4 = new Pizza
       val p = Pizza
       println(p1.getClass)
       println(p2.getClass)
       println(p3.getClass)
       println(p1.getClass)
       println(p.getClass)
    }
}
