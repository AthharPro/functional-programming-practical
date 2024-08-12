error id: file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_8/2.scala:[8..9) in Input.VirtualFile("file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_8/2.scala", "object  {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer as an argument.")
      System.exit(1)
    }

    val input = args(0).toInt

    val categorizeNumber: Int => String = {
      case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
      case n if n % 3 == 0 => "Multiple of Three"
      case n if n % 5 == 0 => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    println(categorizeNumber(input))
  }
}
")
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_8/2.scala
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_8/2.scala:1: error: expected identifier; obtained lbrace
object  {
        ^
#### Short summary: 

expected identifier; obtained lbrace