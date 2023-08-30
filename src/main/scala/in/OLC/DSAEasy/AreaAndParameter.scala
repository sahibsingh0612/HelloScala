package in.OLC.DSAEasy

object AreaAndParameter  {
  def main(args: Array[String]): Unit = {
    // Function to calculate the area of the rectangle
    def calculateArea(length: Int, breadth: Int): Int = {
      length * breadth
    }

    // Function to calculate the perimeter of the rectangle
    def calculatePerimeter(length: Int, breadth: Int): Int = {
      2 * (length + breadth)
    }

    // Accept the length and breadth of the rectangle from the user
    println("Enter the length of the rectangle:")
    val length = scala.io.StdIn.readInt()

    println("Enter the breadth of the rectangle:")
    val breadth = scala.io.StdIn.readInt()

    // Calculate the area and perimeter
    val area = calculateArea(length, breadth)
    val perimeter = calculatePerimeter(length, breadth)

    // Display the result
    println(s"Area = $area")
    println(s"Perimeter = $perimeter")
  }
}
