import scala.io.StdIn.readLine

object prac7_1 {
   def filterEvenNumbers(numList : List[Int]) : List[Int] = {
        return numList.filter(_ % 2 == 0);
    }

    def main(args : Array[String]) : Unit = {
        println("Enter a list of numbers seperated by commas : ");
        val inputNumList = readLine().split(",").map(_.trim.toInt).toList;

        println("Even Numbers : "+ filterEvenNumbers(inputNumList));
    }
}