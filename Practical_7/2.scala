import scala.io.StdIn.readLine

object prac7_2{
    def calculateSqr(numList : List[Int]): List[Int] = {
        return numList.map(num => num * num).filter(_ % 3 == 0);
    }

    def main(args: Array[String]): Unit = {
        println("Enter a list of numbers seperated by commas : ");
        val inputNumList = readLine().split(",").map(_.trim.toInt).toList;

        println("Square Numbers : "+ calculateSqr(inputNumList));

    }
}