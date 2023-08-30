package in.OLC.DSAEasy

object AreaOfCircle {
  def main(args: Array[String]): Unit = {
    // Function to calculate the area of the circle
    def calculateArea(radius: Double): Double = {
      val pi = math.Pi
      pi * radius * radius
    }

    // Function to calculate the circumference of the circle
    def calculateCircumference(radius: Double): Double = {
      val pi = math.Pi
      2 * pi * radius
    }

    // Accept the radius of the circle from the user
    println("Enter the radius of the circle:")
    val radius = scala.io.StdIn.readDouble()

    // Calculate the area and circumference
    val area = calculateArea(radius)
    val circumference = calculateCircumference(radius)

    // Display the result
    println(s"Area = $area")
    println(s"Circumference = $circumference")
  }
}
