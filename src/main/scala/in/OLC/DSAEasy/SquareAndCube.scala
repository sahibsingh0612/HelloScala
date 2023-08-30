package in.OLC.DSAEasy

object SquareAndCube {
  def main(args: Array[String]): Unit = {
    // Function to calculate the square of a number
    def calculateSquare(num: Int): Int = {
      num * num
    }

    // Function to calculate the cube of a number
    def calculateCube(num: Int): Int = {
      num * num * num
    }

    // Accept the input number from the user
    println("Enter an integer:")
    val number = scala.io.StdIn.readInt()

    // Calculate the square and cube
    val square = calculateSquare(number)
    val cube = calculateCube(number)

    // Display the result
    println(s"Square: $square")
    println(s"Cube: $cube")
  }
}
