import scala.io.StdIn.readLine

object prac3_3 {

  def meanValue(num1: Int, num2: Int): Float = {
      val mean = (num1.toFloat + num2.toFloat) / 3.0
      val roundVal = math.round(mean * 100.0) / 100.0
      return roundVal.toFloat
  }

  def main(args: Array[String]): Unit = {
      val num1 = 51
      val num2 = 50
      
      val result = meanValue(num1,num2)
      println(s"Mean of $num1 and $num2 is $result")

  }
}
