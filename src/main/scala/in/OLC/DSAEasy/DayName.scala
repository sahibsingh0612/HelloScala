package in.OLC.DSAEasy

object DayName {
  def main(args: Array[String]): Unit = {

    def printDayName(dayNumber: Int): Unit = {
      dayNumber match {
        case 1 => println("Monday")
        case 2 => println("Tuesday")
        case 3 => println("Wednesday")
        case 4 => println("Thursday")
        case 5 => println("Friday")
        case 6 => println("Saturday")
        case 7 => println("Sunday")
        case _ => println("Invalid entry. Please enter a number between 1 and 7.")
      }
    }


    println("Enter a day number (1 to 7):")
    val dayNumber = scala.io.StdIn.readInt()


    printDayName(dayNumber)
  }
}
