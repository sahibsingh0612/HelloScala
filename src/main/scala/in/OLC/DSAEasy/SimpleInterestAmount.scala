package in.OLC.DSAEasy

object SimpleInterestAmount {
  def main(args: Array[String]): Unit = {1
    // Function to calculate the simple interest
    def calculateSimpleInterest(principal: Double, rate: Double, time: Double): Double = {
      (principal * rate * time) / 100
    }

    // Function to read inputs from the user
    def readInputs(): (Double, Double, Double) = {
      println("Enter the principal amount:")
      val principal = scala.io.StdIn.readDouble()

      println("Enter the rate of interest:")
      val rate = scala.io.StdIn.readDouble()

      println("Enter the time period in years:")
      val time = scala.io.StdIn.readDouble()

      (principal, rate, time)
    }

    val (principalAmount, rateOfInterest, timePeriod) = readInputs()
    val simpleInterest = calculateSimpleInterest(principalAmount, rateOfInterest, timePeriod)

    println(s"Simple Interest: $simpleInterest")
  }
}
