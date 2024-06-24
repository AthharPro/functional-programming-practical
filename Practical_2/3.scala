object prac2_3 {
   def normalWorkHourSalary(workingHour: Int): Int = 250 * workingHour;

   def overtimeSalary(otHour: Int): Int = 85 * otHour;

   def takeHomeSalary(workingHour: Int, otHour: Int): Float = {
      (normalWorkHourSalary(workingHour) + overtimeSalary(otHour) ) * (100-12)/100
   }

   def main(args: Array[String]): Unit = {
      var workingHour = 40
      var otHour = 30

      println("Take Home Salary = Rs." + takeHomeSalary(workingHour, otHour))
   }
}