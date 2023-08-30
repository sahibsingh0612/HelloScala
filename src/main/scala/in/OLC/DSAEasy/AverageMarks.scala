package in.OLC.DSAEasy

object AverageMarks {
  def main(args: Array[String]): Unit = {
    // Function to calculate the average of theory and practical marks
    def calculateAverage(theoryMarks: Double, practicalMarks: Double): Double = {
      (theoryMarks + practicalMarks) / 2
    }

    // Function to display a message based on the average marks
    def displayMessage(average: Double): Unit = {
      if (average >= 90) {
        println("Very good")
      } else {
        println("Work hard")
      }
    }

    // Accept the theory and practical marks from the user
    println("Enter the theory marks:")
    val theoryMarks = scala.io.StdIn.readDouble()

    println("Enter the practical marks:")
    val practicalMarks = scala.io.StdIn.readDouble()

    // Calculate the average
    val average = calculateAverage(theoryMarks, practicalMarks)

    // Display the average and the message
    println(s"Average marks = $average")
    displayMessage(average)
  }
}
