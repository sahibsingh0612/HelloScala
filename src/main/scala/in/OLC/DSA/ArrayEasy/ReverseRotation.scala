package in.OLC.DSA.ArrayEasy

object ReverseRotation {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5, 6, 7)
    val d = 4
    RotateArrayLeft(arr, d)
    println(arr.mkString(","))
      }

  def reverse(arr: Array[Int], start:Int, end:Int): Unit = {
  var left = start
  var right = end
  while(left < right) {
    val temp = arr(left)
    arr(left) = arr(right)
    arr(right) = temp
    left += 1
    right -= 1
  }
  }
  def RotateArrayLeft(arr: Array[Int], d: Int): Unit ={
    val n = arr.length
    reverse(arr, 0, d - 1)
    reverse(arr, d, n - 1)
    reverse(arr, 0, n - 1)
  }
}
