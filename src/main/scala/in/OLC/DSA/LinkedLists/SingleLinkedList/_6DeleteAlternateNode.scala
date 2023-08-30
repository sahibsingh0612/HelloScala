package in.OLC.DSA.LinkedLists.SingleLinkedList

class Node6[A](var value: A, var next: Option[Node6[A]] = None)

class _6LinkedList[A] {
  var head: Option[Node6[A]] = None

  def insert(value: A): Unit = {
   val newNode = new Node6(value)
   if(head.isEmpty) {
     head = Some(newNode)
   } else {
     var current = head
     while(current.get.next.isDefined){
       current = current.get.next
     }
     current.get.next = Some(newNode)
   }
  }


  def deleteAlternateNodes(): Unit = {
    var current = head

    while (current.isDefined && current.get.next.isDefined) {
      current.get.next = current.get.next.get.next
      current = current.get.next
    }
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

object DeleteAlternateNodesInLinkedList {
  def main(args: Array[String]): Unit = {
    val linkedList = new _6LinkedList[Int]()
    linkedList.insert(6)
    linkedList.insert(5)
    linkedList.insert(4)
    linkedList.insert(3)
    linkedList.insert(2)
    linkedList.insert(1)

    println("Original Linked List:")
    linkedList.printList()

    linkedList.deleteAlternateNodes()

    println("Linked List after deleting alternate nodes:")
    linkedList.printList()
  }
}

