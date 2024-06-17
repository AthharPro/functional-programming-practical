/* 5. I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7 
min per km) and 2 km at easy pace again to reach home. What is the 
total running time? */

object object5 {
   def easyPaceTime(distance: Int): Int = 8 * distance

   def tempoPaceTime(distance: Int): Int = 7 * distance

   def totalRunTime(easyDistance: Int, tempoDistance: Int):Int = {
      easyPaceTime(easyDistance) + tempoPaceTime(tempoDistance)
   }

   def main(args: Array[String]): Unit = {
      var easyDistance1 = 2
      var tempoDistance = 3
      var easyDistance2 = 2
      var easyDistance = easyDistance1 + easyDistance2

      println("Total Run Time = " + totalRunTime(easyDistance,tempoDistance) + " min")

   }
}