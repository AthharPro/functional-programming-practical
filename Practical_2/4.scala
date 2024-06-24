object prac2_4 {
   // 120 ppl -> rs. 15    100 ppl -> rs. 20   140 ppl -> rs. 10
   // 120 + (15 - price) * 4 = attendance
   def attendance(ticketPrice: Int): Int = 120 + (15 - ticketPrice) * 4;

   def revenue(ticketPrice: Int): Int = attendance(ticketPrice) * ticketPrice;

   def cost(ticketPrice: Int): Int = 500 + 3 * attendance(ticketPrice);

   def profit(ticketPrice: Int): Int = revenue(ticketPrice) - cost(ticketPrice);

   def main(args: Array[String]): Unit = {
      var price1 = 10; var price2 = 15; var price3 = 20;

      println("Price Rs."+price1+" Profit Rs."+profit(price1));
      println("Price Rs."+price2+" Profit Rs."+profit(price2));
      println("Price Rs."+price3+" Profit Rs."+profit(price3));
   }
}