package in.OLC.DSAEasy

object SimpleInterestCalculator {
  def main(args: Array[String]): Unit = {
    // Function to calculate Simple Interest
    def calculateSimpleInterest(principal: Double, rate: Double, time: Double): Double = {
      principal * rate * time / 100
    }

    // Accept the principal amount, rate of interest, and time period from the user
    println("Enter the principal amount:")
    val principal = scala.io.StdIn.readDouble()

    println("Enter the rate of interest:")
    val rate = scala.io.StdIn.readDouble()

    println("Enter the time period in years:")
    val time = scala.io.StdIn.readDouble()

    // Calculate the Simple Interest
    val simpleInterest = calculateSimpleInterest(principal, rate, time)

    // Display the result
    println(s"Simple Interest = $simpleInterest")
  }
}

