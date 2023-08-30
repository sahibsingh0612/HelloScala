package in.OLC.DSAEasy

object CheckPositiveOrNegative  {
  def main(args: Array[String]): Unit = {
    try {
      print("Enter a number: ")
      val number = scala.io.StdIn.readInt()

      if (number > 0) {
        println("The number is positive.")
      } else if (number < 0) {
        println("The number is negative.")
      } else {
        println("The number is zero.")
      }
    } catch {
      case _: NumberFormatException =>
        println("Invalid input. Please enter a valid number (an integer).")
    }
  }
}
