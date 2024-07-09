object prac4_1{

   def displayInventory(names: Array[String], quantities: Array[Int]): Unit = {
      if(names.length != quantities.length){
         println("Error.")
         return
      }else{
         println("Inventory:")
         println("Item Name | Item Quantity")
         for(i <- 0 to names.length - 1){
            println(s"${names(i)} \t| ${quantities(i)}")
         }
      }
   }

   def restockItem(names: Array[String], quantities: Array[Int], itemName: String, addQuantity: Int): Unit = {
      var i = names.indexOf(itemName)
      if(i == -1){
         println("Item not found.")
         return
      }else{
         quantities(i) += addQuantity
         println(s"Restocked $addQuantity of $itemName.\n New Quantity of $itemName is ${quantities(i)}")
      }

   }

   def sellItem(names: Array[String], quantities: Array[Int], itemName: String, subQuantity: Int): Unit = {
      var i = names.indexOf(itemName)
      if(i == -1){
         println("Item not found.")
         return
      }else{
         if(quantities(i) < subQuantity){
            println(s"Insufficient quantity of $itemName.")
            return
         }
         quantities(i) -= subQuantity
         println(s"Selled $subQuantity of $itemName.\n New Quantity of $itemName is ${quantities(i)}")
      }

   }

   def main(args: Array[String]): Unit = {
      var itemName = Array("Mango", "Apple", "Orange", "Banana", "Grapes")
      var itemQuantity = Array(10, 5, 8, 3, 4)

      displayInventory(itemName, itemQuantity)
      println()
      restockItem(itemName, itemQuantity, "Apple", 5)
      println()
      //displayInventory(itemName, itemQuantity)
      sellItem(itemName, itemQuantity, "Mango", 3)
   }
}