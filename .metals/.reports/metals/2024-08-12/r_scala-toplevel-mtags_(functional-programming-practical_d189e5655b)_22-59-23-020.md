error id: file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_8/1.scala:[339..340) in Input.VirtualFile("file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_8/1.scala", "object prac8_1 {

   def encryption(text: String, shift: Int): String = {
      text.map{char =>
         char match {
            case c if c.isLower => ('a' + (c - 'a' + shift)% 26).toChar
            case c if c.isUpper => ('A' + (c - 'A' + shift)% 26).toChar
            case _ => char 
         }
      }
   }

   def 

}")
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_8/1.scala
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_8/1.scala:15: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace