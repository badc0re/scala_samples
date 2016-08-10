object Solution {

    def main(args: Array[String]) {
        // N - no. of prisoners
        // T - no. of testcases
        // T =  N(the number of prisoners) 5,  M(the number of sweets) 3, and  S(the prisoner ID) 4
        // 1 2 3 4 5
        val sc = new java.util.Scanner(System.in);
        var n = 5
        var m = 3
        var s = 4
        var currentID = s - 1;
        def input = for (i <- 1 to t) yield readLine().split(" ").map(_.toInt)
        for (i <- 1 to m) {
           currentID = if (currentID == n) 1 else currentID + 1
        } 
        println(currentID)
    }
}
