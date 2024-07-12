object prac4_3 {
  def toUpper(name: String): String = {
    name.map { c =>
      if (c >= 'a' && c <= 'z') (c - 32).toChar else c
    }
  }

  def toLower(name: String): String = {
    name.map { c =>
      if (c >= 'A' && c <= 'Z') (c + 32).toChar else c
    }
  }
  
  def formatNames(name: String)(format: String => String): String = format(name)

  def main(args: Array[String]): Unit = {
    var name1 = "Benny"
    var name2 = "Niroshan"
    var name3 = "Saman"
    var name4 = "Kumara"

    println(formatNames(name1)(toUpper))
    println(
      formatNames(name2)(name =>
        toUpper(name.substring(0, 2)) + name.substring(2)
      )
    )
    println(formatNames(name3)(toLower))
    println(
      formatNames(name4)(name =>
        name.substring(0, name.length - 1) + toUpper(
          name.substring(name.length - 1)
        )
      )
    )
  }
}
