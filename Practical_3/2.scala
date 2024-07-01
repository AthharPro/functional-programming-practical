import scala.io.StdIn.readLine

object prac3_2 {

  def longString(str: Array[String]): Array[String] = {
    str.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {

    print("No of Strings: ")
    val n = readLine().toInt
    var strList = new Array[String](n)

    for (i <- 0 to n - 1) {
      print(s"Enter String ${i + 1}: ")
      strList(i) = readLine()
    }

    val longStrList = longString(strList)
    if (longStrList.length > 0) {
      println("Strings with length greater than 5: ")
      for (i <- 0 to longStrList.length - 1) {
        println(longStrList(i))
      }
    }else{
      println("No Strings with length greater than 5")
    }

  }
}
