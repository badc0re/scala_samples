

object Solution {
    var alice = 0;
    var bob = 0;
    def compareEq(a: Int, b: Int) = if (a == b) true else false
    def compareBig(a: Int, b: Int) = if (a > b) true else false
    def compare(a: Int, b: Int){
        if (!compareEq(a, b)){
            if (compareBig(a, b)){
                alice = alice + 1
            }else{
                bob = bob + 1
            }
        }
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var a0 = sc.nextInt();
        var a1 = sc.nextInt();
        var a2 = sc.nextInt();
        var b0 = sc.nextInt();
        var b1 = sc.nextInt();
        var b2 = sc.nextInt();
        compare(a0, b0)
        compare(a1, b1)
        compare(a2, b2)
        println(alice + " " + bob)
    }
}
