package in.OLC.DSAEasy

object RectangleDiagonalCalculator {
  def main(args: Array[String]): Unit = {
    // Function to calculate the diagonal of the rectangle
    def calculateDiagonal(height: Double, width: Double): Double = {
      Math.sqrt(height * height + width * width)
    }

    // Function to read height and width from the user
    def readInputs(): (Double, Double) = {
      println("Enter the height of the rectangle:")
      val height = scala.io.StdIn.readDouble()

      println("Enter the width of the rectangle:")
      val width = scala.io.StdIn.readDouble()

      (height, width)
    }

    val (rectangleHeight, rectangleWidth) = readInputs()
    val diagonal = calculateDiagonal(rectangleHeight, rectangleWidth)

    println(s"Diagonal of the rectangle: $diagonal")
  }
}
