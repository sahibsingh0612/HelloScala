package in.OLC.DSAEasy

object TraingleArea {
  def main(args: Array[String]): Unit = {
    // Function to calculate the area of the triangle using Heron's formula10
    def calculateArea(a: Double, b: Double, c: Double): Double = {
      val s = (a + b + c) / 2
      Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }

    // Accept the values of three sides of the triangle from the user
    println("Enter the value of side a:")
    val a = scala.io.StdIn.readDouble()

    println("Enter the value of side b:")
    val b = scala.io.StdIn.readDouble()

    println("Enter the value of side c:")
    val c = scala.io.StdIn.readDouble()

    // Calculate the area using Heron's formula
    val area = calculateArea(a, b, c)

    // Display the result
    println(s"Area of the triangle = $area")
  }
}
