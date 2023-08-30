package in.OLC.DSA.ArrayEasy

object PrintDistinctElement {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 1, 2, 5, 6, 3)
    printDistinctElements(arr)
  }

  def printDistinctElements(arr: Array[Int]): Unit = {
    val distinctSet = arr.toSet
    println("Distinct elements:")
    distinctSet.foreach(element => println(element))
  }
}