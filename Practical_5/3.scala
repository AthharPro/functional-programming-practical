import scala.io.StdIn.readLine

object prac5_3{

   def fibonacci(n: Int): Int = {
      if(n<=1){
         n
      }else{
         fibonacci(n-1) + fibonacci(n-2)
      }
   }

   def printFib(n: Int): Unit = {
      print(s"The first $n Fibonacci Numbers are : ")
      for(i <- 0 until n){
         print(fibonacci(i).toString + " ")
      }
   }

   def main(args: Array[String]): Unit = {
      print("Enter the number of Fibonacci Numbers to print: ")
      var n = readLine().toInt
      printFib(n)
   }
}