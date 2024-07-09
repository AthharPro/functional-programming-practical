error id: file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_4/2.scala:[412..412) in Input.VirtualFile("file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_4/2.scala", "import scala.io.StdIn.readLine

object prac4_2{

   def main(args: Array[String]): Unit = {
      println("Enter a Number: ")
      var number = readLine().toInt

      number match{
         case x if x <= 0 => println("Negative/zero is input")
         case x if x % 2 == 0 => println("Even Number is given")
         case x if x % 2 != 0 => println("Odd Number is given")
      }
   }
}
object ")
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_4/2.scala
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_4/2.scala:16: error: expected identifier; obtained eof
object 
       ^
#### Short summary: 

expected identifier; obtained eof