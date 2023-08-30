package in.OLC.DSAEasy

object Square {
  def main(args: Array[String]): Unit = {
    // Function to calculate the area of the square
    def calculateArea(side: Double): Double = {
      side * side
    }

    // Function to calculate the perimeter of the square
    def calculatePerimeter(side: Double): Double = {
      4 * side
    }

    // Accept the side of the square from the user
    println("Enter the side of the square:")
    val side = scala.io.StdIn.readDouble()

    // Calculate the area and perimeter
    val area = calculateArea(side)
    val perimeter = calculatePerimeter(side)

    // Display the result
    println(s"Area = $area")
    println(s"Perimeter = $perimeter")
  }
}
