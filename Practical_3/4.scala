import scala.io.StdIn.readLine

object prac3_4 {

  def sumOfEven(nums: Array[Int]): Int = {
    var sum = 0
    for (i <- 0 to nums.length - 1) {
      if (nums(i) % 2 == 0) {
        sum += nums(i)
      }
    }
    return sum
  }

  def main(args: Array[String]): Unit = {
    print("No of integers: ")
    val n = readLine().toInt
    var intList = new Array[Int](n)

    for (i <- 0 to n - 1) {
      print(s"Enter number ${i + 1}: ")
      intList(i) = readLine().toInt
    }

    val sums = sumOfEven(intList)
    println(s"Sum of even numbers: $sums")
  }
}
