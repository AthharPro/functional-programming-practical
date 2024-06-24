object prac2_1 {
   def main(args: Array[String]) = {
      var i, j, k: Int = 2
      var m, n: Int = 5
      var f: Float = 12.0f
      var g: Float = 4.0f
      var c: Char = 'X'

      val resultA = k + 12 * m
      val resultB = m / j
      val resultC = n % j
      val resultD = m / j * j
      val resultE = f + 10 * 5 + g
      i += 1
      val resultF = i * n

      println(s"Result A: $resultA")  // 62
      println(s"Result B: $resultB")  // 2
      println(s"Result C: $resultC")  // 1
      println(s"Result D: $resultD")  // 4
      println(s"Result E: $resultE")  // 66.0
      println(s"Result F: $resultF")  // 15
   }
}