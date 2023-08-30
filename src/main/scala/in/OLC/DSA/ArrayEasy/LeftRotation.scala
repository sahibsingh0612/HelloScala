package in.OLC.DSA.ArrayEasy

object LeftRotation {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 3, 5, 7, 9)
    val rotations = Array(1, 3, 4, 6)

    for (k <- rotations) {
      printLeftRotation(arr, k)
      println()
    }
  }

  def printLeftRotation(arr: Array[Int], k: Int): Unit = {
    val n = arr.length
    val rotations = k % n // Adjust rotations to handle cases where k > n

    for (i <- 0 until n) {
      val newIndex = (i + rotations) % n
      print(arr(newIndex) + " ")
    }
  }
}
