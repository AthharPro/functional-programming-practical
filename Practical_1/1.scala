//1. Area of a disk with radius r is Pi r*r. What is the area of a disk with radius 5?

object object1 {
   def areaOfDisk(r: Double): Double = {
      val pi = math.Pi
      pi * r * r
   }

   def main(args: Array[String]): Unit = {
      var radius = 5
      var area = areaOfDisk(radius)
      println(f"Area of a Disk with radius $radius%.2f is $area%.2f")
   }
}