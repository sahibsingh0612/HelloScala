package in.OLC.DSA.LinkedLists.SingleLinkedList

class Node[A](var value: A, var next: Option[Node[A]] = None)

class LinkedList[A] {
  var head: Option[Node[A]] = None

  def insert(value: A): Unit = {
    val newNode = new Node(value)
    if (head.isEmpty) {
      head = Some(newNode)
    } else {
      var current = head
      while (current.get.next.isDefined) {
        current = current.get.next
      }
      current.get.next = Some(newNode)
    }
  }
  def insertInBegining (value: A): Unit ={
    val newNode = new Node(value)
    newNode.next = head
    head = Some(newNode)
  }

  def printList(): Unit = {
    var current = head
    while (current.isDefined) {
      print(current.get.value + " -> ")
      current = current.get.next
    }
    println("null")
  }
}

object InsertNodeInLinkedList {
  def main(args: Array[String]): Unit = {
    val linkedList = new LinkedList[Int]()
    linkedList.insert(10)
    linkedList.insert(20)
    linkedList.insert(30)

    linkedList.insertInBegining(9)
    linkedList.insertInBegining(5
    )
    println("Linked list:")
    linkedList.printList()
  }
}
