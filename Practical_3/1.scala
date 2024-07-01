import scala.io.StdIn.readLine

object prac3_1 {

   def reverseString(s: String): String = {
      if(s.isEmpty()){
         return ""
      }else{
         return s.substring(s.length() - 1) + reverseString(s.substring(0, s.length() - 1))
      }
   }
   def main(args: Array[String]): Unit = {
      print("Enter a String: ");
      val inputStr = readLine();
      val reversedStr = reverseString(inputStr)
      println("The Reversed String: "+reversedStr)
   }
}