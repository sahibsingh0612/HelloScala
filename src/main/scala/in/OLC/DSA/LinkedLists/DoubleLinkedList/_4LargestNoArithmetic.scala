package in.OLC.DSA.LinkedLists.DoubleLinkedList

class Node4(var value: Int, var prev: Option[Node4] = None, var next: Option[Node4] = None)

class _4LargestNoArithmetic {
  var head: Option[Node4] = None
  var tail: Option[Node4] = None

  def insert(value: Int): Unit = {
    val newNode = new Node4(value)
    if (head.isEmpty) {
      head = Some(newNode)
      tail = Some(newNode)
    } else {
      newNode.prev = tail
      tail.foreach(_.next = Some(newNode))
      tail = Some(newNode)
    }
  }

  def printList(): Unit = {
    var current = head
    while (current.isDefined) {
      print(current.get.value)
      current = current.get.next
    }
    println()
  }

  def add(otherList: _4LargestNoArithmetic): _4LargestNoArithmetic = {
    val result = new _4LargestNoArithmetic()

    var carry = 0
    var node1 = tail
    var node2 = otherList.tail

    while (node1.isDefined || node2.isDefined || carry > 0) {
      val sum = carry + node1.map(_.value).getOrElse(0) + node2.map(_.value).getOrElse(0)
      result.insert(sum % 10)
      carry = sum / 10

      node1 = node1.flatMap(_.prev)
      node2 = node2.flatMap(_.prev)
    }

    result
  }
}

object LargeNumberArithmetic {
  def main(args: Array[String]): Unit = {
    val number1 = new _4LargestNoArithmetic()
    val number2 = new _4LargestNoArithmetic()

    number1.insert(9)
    number1.insert(9)
    number1.insert(9)

    number2.insert(2)
    number2.insert(5)
    number2.insert(3)

    println("Number 1:")
    number1.printList()

    println("Number 2:")
    number2.printList()

    val sum = number1.add(number2)
    println("Sum:")
    sum.printList()
  }
}

