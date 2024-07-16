import scala.io.StdIn.readLine

object prac4_2{
   def main(args: Array[String]): Unit = {
      println("Enter a Number: ")
      var number = readLine().toInt

      number match{
         case x if x == 0 => println("zero is input")
         case x if x <= 0 => println("Negative/zero is input")
         case x if x % 2 == 0 => println("Even Number is given")
         case x if x % 2 != 0 => println("Odd Number is given")
      }
   }
}