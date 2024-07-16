error id: file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_5/1.scala:[643..646) in Input.VirtualFile("file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_5/1.scala", "import scala.io.StdIn.readLine

object prac5_1{

   def getProductList(): List[String] = {
      var products = List[String]()
      println("Enter Product Name (type 'done' to finish):")
      var flag = true
      while(flag){
         var product = readLine()
         if(product == "done"){
            flag = false
         }else{
            products = products :+ product
         }
      }
      products
   }

   def printProductList(products: List[String]): Unit = {
      println("\nProduct List:")
      for(i <- products.indices){
         println(s"${i+1}. ${products(i)}")
      }
   } 

   def 

   def main(args: Array[String]): Unit = {
      var productList = getProductList()
      printProductList(productList)
   }
}")
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_5/1.scala
file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_5/1.scala:29: error: expected identifier; obtained def
   def main(args: Array[String]): Unit = {
   ^
#### Short summary: 

expected identifier; obtained def