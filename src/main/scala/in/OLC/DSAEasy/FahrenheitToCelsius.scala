package in.OLC.DSAEasy

object FahrenheitToCelsius {
  def main(args: Array[String]): Unit = {
    // Function to convert Fahrenheit to Celsius
    def fahrenheitToCelsius(fahrenheit: Double): Double = {
      (fahrenheit - 32) * 5/9
    }

    // Accept the temperature in Fahrenheit from the user
    println("Enter the temperature in Fahrenheit (°F):")
    val fahrenheit = scala.io.StdIn.readDouble()

    // Convert Fahrenheit to Celsius
    val celsius = fahrenheitToCelsius(fahrenheit)

    // Display the result
    println(s"Temperature in Celsius (°C): $celsius")
  }
}
