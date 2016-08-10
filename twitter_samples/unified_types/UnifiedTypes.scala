


object UnifiedTypes extends App{
  val set = new scala.collection.mutable.LinkedHashSet[Any]
  set += "This is a derp"
  set += 953
  set += 'd'
  set += "dick"
  set += main _
  val iter: Iterator[Any] = set.iterator
  while (iter.hasNext){
    println(iter.next.toString())
  }
}
