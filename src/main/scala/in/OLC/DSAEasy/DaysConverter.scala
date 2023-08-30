package in.OLC.DSAEasy

object DaysConverter {
  def main(args: Array[String]): Unit = {
    // Function to convert days to years, weeks, and remaining days
    def convertDays(days: Int): (Int, Int, Int) = {
      val years = days / 365
      val remainingDaysAfterYears = days % 365
      val weeks = remainingDaysAfterYears / 7
      val remainingDays = remainingDaysAfterYears % 7
      (years, weeks, remainingDays)
    }

    // Accept the number of days from the user
    println("Enter the number of days:")
    val days = scala.io.StdIn.readInt()

    // Convert days to years, weeks, and remaining days
    val (years, weeks, remainingDays) = convertDays(days)

    // Display the result
    println(s"Years: $years")
    println(s"Weeks: $weeks")
    println(s"Remaining Days: $remainingDays")
  }
}

