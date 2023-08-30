package in.OLC

object EvenOrOdd {

  def main(args:Array[String]) {
    var num:Int=0
    var result:String=""

    println("Enter number: ")
    num = scala.io.StdIn.readInt()

    result = if (num%2==0) "EVEN" else "ODD"

    println("Number is: "+result)
  }
}
