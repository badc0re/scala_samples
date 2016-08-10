object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/ 
        // the counting can be done while reading the input
        // with a dictionary, then only search is performed
        val sc = new java.util.Scanner(System.in)
        var strMap = scala.collection.mutable.Map.empty[String, Int]
        var N = sc.nextLine().toInt
        for (idx <- 0 to N - 1){
            var tempStr = sc.nextLine()
            strMap(tempStr) = if (strMap.keySet.exists(_ == tempStr)) strMap(tempStr) + 1 else 1
        }
        var qn = sc.nextLine().toInt;
        for (idx <- 0 to qn - 1){
            var query = sc.nextLine()
            println(if (strMap.keySet.exists(_ == query)) strMap(query) else "0")
        }
        
    }
}
