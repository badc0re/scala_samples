

trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}


class Point(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = yc
  def isSimilar(obj: Any) =
    obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x &&
    obj.asInstanceOf[Point].y == y
}

object TestPoint extends App {
  val pt1 = new Point(2,1)
  val pt2 = new Point(2,1)
  println(pt1.isSimilar(pt2))
  println(pt1.isSimilar(4))
}
