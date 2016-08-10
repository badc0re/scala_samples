
object FileUtils{

    def readFile(filename: String) = {
        "abdula"
    }

    def writeFile(filename: String, contents: String){
        println(s"Written to $filename contents $contents")
    }
}



object Solution{
    def main(args: Array[String]){
        val contents = FileUtils.readFile("test.txt")
        FileUtils.writeFile("test1.txt", contents)
        // new won't work, because it is an object
    }
}
