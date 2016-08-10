
class Student(inputName: String, inputAge: Int, inputWeight: Int){
  val name = inputName;
  val age = inputAge;
  val weight = inputWeight;
}

object SubstituteVars{
  def main(args: Array[String]){
    val name = "dame"
    val age = 26
    val weight = 88
    val noobStudent = new Student("derp", 242, 2141)
    
    // this is called string interpolation (s and f interpolation) 
    // they are functions also
    println(s"The derps name is $name, with $age and $weight")
    println(s"Ho ho ho ${noobStudent.name} and ${noobStudent.age}")
    println(s"bla has ${3 * 2}kg of apples")
    println(s"bla is not eq to bla? ${"bla" != "bla"}")
  }
}

