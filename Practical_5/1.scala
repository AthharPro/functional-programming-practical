import scala.io.StdIn.readLine

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

   def getTotalProducts(products: List[String]): Unit = {
      println(s"\nTotal Products: ${products.length}")
   }

   def main(args: Array[String]): Unit = {
      var productList = getProductList()
      printProductList(productList)
      getTotalProducts(productList)
   }
}