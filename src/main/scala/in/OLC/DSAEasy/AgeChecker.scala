package in.OLC.DSAEasy

object AgeChecker {
  def main(args: Array[String]): Unit = {
    try {
      print("Enter your age: ")
      val age = scala.io.StdIn.readInt()

      if (age < 18) {
        println("You are a minor.")
      } else {
        println("You are a major.")
      }
    } catch {
      case _: NumberFormatException =>
        println("Invalid input. Please enter a valid age (an integer).")
    }
  }
}
