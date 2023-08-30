package in.OLC.DSAEasy

object SphereVolume  {
  def main(args: Array[String]): Unit = {
    // Function to calculate the volume of a sphere
    def calculateVolume(radius: Double): Double = {
      val pi = math.Pi
      (4.0 / 3.0) * pi * math.pow(radius, 3)
    }

    // Accept the radius of the sphere from the user
    println("Enter the radius of the sphere:")
    val radius = scala.io.StdIn.readDouble()

    // Calculate the volume of the sphere
    val volume = calculateVolume(radius)

    // Display the result
    println(s"Volume of the sphere: $volume")
  }
}

