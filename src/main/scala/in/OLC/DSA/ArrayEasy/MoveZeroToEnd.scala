package in.OLC.DSA.ArrayEasy

object MoveZeroToEnd {
  def main(args: Array[String]): Unit = {
    val arr = Array(0, 3, 0, 2, 8, 0, 4, 0, 1) // Modify this array as needed

    moveZerosToEnd(arr)
    println(s"Array after moving zeros to end: ${arr.mkString(", ")}")
  }

  def moveZerosToEnd(arr: Array[Int]): Unit = {
    var nonZeroIndex = 0

    for (num <- arr) {
      if (num != 0) {
        arr(nonZeroIndex) = num
        nonZeroIndex += 1
      }
    }

    while (nonZeroIndex < arr.length) {
      arr(nonZeroIndex) = 0
      nonZeroIndex += 1
    }
  }
}

