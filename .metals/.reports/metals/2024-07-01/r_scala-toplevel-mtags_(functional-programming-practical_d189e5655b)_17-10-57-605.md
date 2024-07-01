error id: file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_3/2.scala:[68..71) in Input.VirtualFile("file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_3/2.scala", "import scala.io.StdIn.readLine

object prac3_2 {

   def 

   def main(args: Array[String]): Unit = {
      
      print("No of Strings: ")
      val n = readLine().toInt
      var strList = new Array[String](n)

      for(i <- 0 to n-1){
         print(s"Enter a String ${i+1}: ")
         strList(i) = readLine()
      }
      
      
   }
}")
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_3/2.scala
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_3/2.scala:7: error: expected identifier; obtained def
   def main(args: Array[String]): Unit = {
   ^
#### Short summary: 

expected identifier; obtained def