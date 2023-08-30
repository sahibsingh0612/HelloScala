package in.OLC.DSAEasy

object MarkSheet {
  def main(args: Array[String]): Unit = {
    val numOfSubjects = 5
    val maxMarks = 100

       def readMarks(): List[Double] = {
      println(s"Enter marks for $numOfSubjects subjects (out of $maxMarks):")
      List.fill(numOfSubjects)(scala.io.StdIn.readDouble())
    }

    // Function to calculate the average of marks
    def calculateAverage(marks: List[Double]): Double = {
      marks.sum / marks.length
    }

    // Function to calculate the grade
    def calculateGrade(average: Double): String = {
      if (average >= 90) "A+"
      else if (average >= 80) "A"
      else if (average >= 70) "B"
      else if (average >= 60) "C"
      else if (average >= 50) "D"
      else "Fail"
    }

    val marks = readMarks()
    val averageMarks = calculateAverage(marks)
    val grade = calculateGrade(averageMarks)

    println(s"Average marks: $averageMarks")
    println(s"Grade: $grade")
  }
}

