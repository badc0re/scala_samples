
class Stock {
    private var price: Double = _
    def setPrice(p: Double) { price = p}
    def isHigher(that: Stock): Boolean = this.price > that.price
}

object Driver extends App{
    val s1 = new Stock
    s1.setPrice(10)
    
    val s2 = new Stock
    s2.setPrice(40)

    println(s1.isHigher(s2))
}
