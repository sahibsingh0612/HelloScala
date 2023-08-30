package in.OLC.DSA.ArrayEasy

object _2SecondLargestNumber  {
  def main(args: Array[String]): Unit = {
    val arr = Array (10, 4, 3, 50, 23, 90) // Modify this array as needed

    if (arr.length < 2) {
      println("Invalid input.")
    } else {
      findSecondLargest(arr)
    }
  }

  def findSecondLargest(arr: Array[Int]): Unit = {
    var firstLargest = Int.MinValue
    var secondLargest = Int.MinValue


    for (num <- arr) {
      if (num > firstLargest) {
         secondLargest = firstLargest
        firstLargest = num
      } else if (num > secondLargest) {
        secondLargest = num

      }
    }

    println(s"Second largest elements: $secondLargest")
  }
}

