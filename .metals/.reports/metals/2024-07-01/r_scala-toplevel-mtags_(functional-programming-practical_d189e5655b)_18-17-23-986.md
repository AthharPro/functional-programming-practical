error id: file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_3/4.scala:[67..70) in Input.VirtualFile("file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_3/4.scala", "import scala.io.StdIn.readLine

object prac3_4 {

   def 

  def main(args: Array[String]): Unit = {
    print("No of integers: ")
    val n = readLine().toInt
    var intList = new Array[Int](n)

    for (i <- 0 to n - 1) {
      print(s"Enter number ${i + 1}: ")
      intList(i) = readLine().toInt
    }


  }
}
")
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_3/4.scala
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_3/4.scala:7: error: expected identifier; obtained def
  def main(args: Array[String]): Unit = {
  ^
#### Short summary: 

expected identifier; obtained def