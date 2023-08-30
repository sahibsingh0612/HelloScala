package in.OLC.DSA.ArrayEasy

object _1Largest3Elements  {
  def main(args: Array[String]): Unit = {
    val arr = Array (10, 4, 3, 50, 23, 90) // Modify this array as needed

    if (arr.length < 3) {
      println("Array should have at least three elements.")
    } else {
      findLargestThree(arr)
    }
  }

  def findLargestThree(arr: Array[Int]): Unit = {
    var firstLargest = Int.MinValue
    var secondLargest = Int.MinValue
    var thirdLargest = Int.MinValue

    for (num <- arr) {
      if (num > firstLargest) {
        thirdLargest = secondLargest
        secondLargest = firstLargest
        firstLargest = num
      } else if (num > secondLargest) {
        thirdLargest = secondLargest
        secondLargest = num
      } else if (num > thirdLargest) {
        thirdLargest = num
      }
    }

    println(s"Largest three elements: $firstLargest, $secondLargest, $thirdLargest")
  }
}

