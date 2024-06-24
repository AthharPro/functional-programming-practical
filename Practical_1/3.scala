//3. The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere with radius 5?

object object3{
   def volumeOfSphere(r: Double): Double = {
      var pi = math.Pi
      var vol = 4.0/3.0 * pi * r*r*r
      vol
   }

   def main(args: Array[String]): Unit = {
      var radius = 5.0
      var volume = volumeOfSphere(radius)
      println(f"Volume of a Sphere with radius $radius%.2f is $volume%.2f")
   }
}