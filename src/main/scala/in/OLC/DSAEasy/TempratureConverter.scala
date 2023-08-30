package in.OLC.DSAEasy

object TempratureConverter  {
  def main(args: Array[String]): Unit = {
    // Function to convert Celsius to Fahrenheit
    def celsiusToFahrenheit(celsius: Double): Double = {
      (celsius * 9/5) + 32
    }

    // Accept the temperature in Celsius from the user
    println("Enter the temperature in Celsius (°C):")
    val celsius = scala.io.StdIn.readDouble()

    // Convert Celsius to Fahrenheit
    val fahrenheit = celsiusToFahrenheit(celsius)

    // Display the result
    println(s"Temperature in Fahrenheit (°F): $fahrenheit")
  }
}
