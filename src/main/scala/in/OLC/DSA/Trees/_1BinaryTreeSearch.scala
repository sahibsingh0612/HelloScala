package in.OLC.DSA.Trees

class TreeNode[A](var value: A, var left: Option[TreeNode[A]] = None, var right: Option[TreeNode[A]] = None)

class BinaryTree[A](var root: Option[TreeNode[A]] = None) {

  def contains(value: A): Boolean = {
    containsRec(root, value)
  }

  private def containsRec(node: Option[TreeNode[A]], value: A): Boolean = {
    node match {
      case None => false
      case Some(n) if n.value == value => true
      case Some(n) => containsRec(n.left, value) || containsRec(n.right, value)
    }
  }
}

object _1BinaryTreeSearch {
  def main(args: Array[String]): Unit = {
    val binaryTree = new BinaryTree[Int]()
    val root = new TreeNode(6)
    root.left = Some(new TreeNode(4))
    root.right = Some(new TreeNode(8))
    root.left.get.left = Some(new TreeNode(3))
    root.left.get.right = Some(new TreeNode(5))
    root.left.get.right.get.left = Some(new TreeNode(1))


    root.right.get.left = Some(new TreeNode(7))
    root.right.get.right = Some(new TreeNode(9))

    binaryTree.root = Some(root)

    val searchValue = 17
    val isPresent = binaryTree.contains(searchValue)

    println(s"The element $searchValue is ${if (isPresent) "PRESENT" else "NOT PRESENT"} in the binary tree.")
  }
}
