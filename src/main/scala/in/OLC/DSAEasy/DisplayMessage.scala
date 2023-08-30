package in.OLC.DSAEasy

object DisplayMessage {
  def main(args: Array[String]): Unit = {
    try {
      print("Enter an integer value: ")
      val number = scala.io.StdIn.readInt()

      val message = number match {
        case 1 => "I can Dance"
        case 2 => "I can sing"
        case 3 => "I can swim"
        case _ => "Sorry Wrong Input"
      }

      println(message)
    } catch {
      case _: NumberFormatException =>
        println("Invalid input. Please enter a valid integer.")
    }
  }
}
