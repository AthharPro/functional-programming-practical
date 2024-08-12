object prac8_2 {

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer as an argument.")
      return
    }

    val input = args(0).toInt

    input match {
      case n if n % 3 == 0 && n % 5 == 0 => println("Multiple of Both Three and Five")
      case n if n % 3 == 0 => println("Multiple of Three")
      case n if n % 5 == 0 => println("Multiple of Five")
      case _ => println("Not a Multiple of Three or Five")
    }

  }
}
