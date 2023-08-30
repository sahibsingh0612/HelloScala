package in.OLC.DSA.LinkedLists.CircularLinkedList.SingleCircularLinkedList

class Node[A](var value: A, var next: Option[Node[A]] = None)

class CircularLinkedList[A] {
  var head: Option[Node[A]] = None
  var tail: Option[Node[A]] = None

  def insert(value: A): Unit = {
    val newNode = new Node(value)
    if (head.isEmpty) {
      head = Some(newNode)
      newNode.next = head
    } else {
      var currentElement = head
      while (currentElement.get.next!=head) {
        currentElement = currentElement.get.next
      }
      newNode.next = head
      currentElement.get.next = Some(newNode)
    }
  }

  def printList(): Unit = {
    var currentNode = head
    var i = 0
    while (i == 0 || currentNode != head) {
      print(currentNode.get.value + "->")
      currentNode = currentNode.get.next
      i += 1
    }
    println("Null")
  }
}

object CreateCircularLinkedList {
  def main(args: Array[String]): Unit = {
    val circularLinkedList = new CircularLinkedList[Int]()

    circularLinkedList.insert(10)
    circularLinkedList.insert(20)
    circularLinkedList.insert(30)
    circularLinkedList.insert(40)


    println("Circular Linked List:")
    circularLinkedList.printList()
  }
}

