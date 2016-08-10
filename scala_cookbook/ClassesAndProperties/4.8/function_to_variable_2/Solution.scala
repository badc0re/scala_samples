

class Foo{
    import scala.xml.XML
    // directly from server :)
    val xml = XML.load("http://www.xmlfiles.com/examples/note.xml")
}

object Solution extends App{
    val f = new Foo
    println(f.xml)

}
