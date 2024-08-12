import scala.io.StdIn.readLine

object prac8_1 {

   def encryption(text: String, shift: Int): String = {
      text.map{char =>
         char match {
            case c if c.isLower => ('a' + (c - 'a' + shift + 26)% 26).toChar
            case c if c.isUpper => ('A' + (c - 'A' + shift + 26)% 26).toChar
            case _ => char 
         }
      }
   }

   def decryption(text: String, shift: Int): String = {
      encryption(text, -shift)
   }

   def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
      operation(text,shift)
   }

   def main(args: Array[String]): Unit = {
      println("Enter the text to be encrypted : ")
      val text = readLine()
      println("Enter the shift value : ")
      val shift = readLine().toInt

      val encryptedText = cipher(text, shift, encryption)
      val decryptedText = cipher(encryptedText, shift, decryption)

      println("Encrypted text : " + encryptedText)
      println("Decrypted text : " + decryptedText)
   }
}