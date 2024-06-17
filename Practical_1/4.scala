/* 4. Suppose the cover price of a book is Rs. 24.95, but bookstores get 
a 40% discount. Shipping costs Rs. 3 for the first 50 copies and 75 
cents for each additional copy. What is the total wholesale cost for 60 
copies?  */

object object4 {
   def bookstorePrice(bookPrice: Double): Double = bookPrice * 60/100

   def shippingCost(noOfCopies: Int): Double = {
      var first50 = 3.00
      var extra = 0.75

      if(noOfCopies <= 50){
         first50
      }else{
         first50 + (noOfCopies - 50)*extra
      }
   }

   def wholesaleCost(bookPrice: Double,noOfCopies: Int): Double = {
      bookstorePrice(bookPrice) + shippingCost(noOfCopies)
   } 

   def main(args: Array[String]) = {
      var bookPrice = 24.95
      var copies = 60
      var finalPrice = wholesaleCost(bookPrice, copies)
      println(f"Price of a book Rs.$bookPrice%.2f")
      println(s"No. of copies $copies")
      println(f"Total Wholesale Cost $finalPrice%.2f")
   }
}