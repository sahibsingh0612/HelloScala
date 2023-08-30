package in.OLC.DSA.LinkedLists.DoubleLinkedList

class Node2[A](var value: A, var prev: Option[Node2[A]] = None, var next: Option[Node2[A]] = None)

class _2SizeOfLinkedList[A] {
var head: Option[Node2[A]] = None
  var tail: Option[Node2[A]] = None

  def insert(value:A): Unit = {
    var newNode = new Node2(value)
    if(head.isEmpty){
      head = Some(newNode)
      tail = Some(newNode)
    } else{
      newNode.prev = tail
      tail.foreach(_.next = Some(newNode))
      tail = Some(newNode)
    }
  }

  def findSize(): Int = {
    var count = 0
    var current = head
    while (current.isDefined) {
      count += 1
      current = current.get.next
    }
    count
  }

  def printList(): Unit = {
    var current = head
    while (current.isDefined) {
      print(current.get.value + " <-> ")
      current = current.get.next
    }
    println("null")
  }
}



object _2DoublyLinkedList{
  def main(args: Array[String]): Unit = {
    val doublyLinkedList = new _2SizeOfLinkedList[Int]()

    doublyLinkedList.insert(10)
    doublyLinkedList.insert(20)
    doublyLinkedList.insert(30)
    doublyLinkedList.insert(40)

    println("doublyLinkedList after insertion:")
    doublyLinkedList.printList()

    val size = doublyLinkedList.findSize()
    println(s"Size of the doubly linked list: $size")

  }
}