//2. The temperature is 35C; convert this temperature into Fahrenheit. ºF =ºC * 1.8000 + 32.00

object object2{
   def celsiusToFahrenheit(c: Double): Double = {
      var f = c * 1.8 + 32.0
      return f
   }

   def main(arge: Array[String]): Unit = {
      var celsius = 35
      var Fahrenheit = celsiusToFahrenheit(celsius)
      println(f"Temperature of $celsius%.2fºC in Fahrenheit is $Fahrenheit%.2fºF")
   }
}