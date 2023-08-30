package in.OLC.DSA.ArrayEasy

object WaveFormSort {
  def main(args: Array[String]): Unit = {
    val arr = Array(3, 1, 4, 2, 5)
    sortInWaveForm(arr)
    println(arr.mkString(", "))
  }

  def sortInWaveForm(arr: Array[Int]): Unit = {
    val n = arr.length
    scala.util.Sorting.quickSort(arr) // Sort the array first

    for (i <- 0 until n by 2) {
      if (i + 1 < n) {
        val temp = arr(i)
        arr(i) = arr(i + 1)
        arr(i + 1) = temp
      }
    }
  }
}
