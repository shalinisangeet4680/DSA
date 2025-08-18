package Binary_Tree;

import java.util.ArrayList;
import java.util.List;

class Node {
  int data;
  Node left;
  Node right;

  Node(int data1) {
    this.data = data1;
    this.left = null;
    this.right = null;
  }
}

public class PostOrderTraversalRecursion {
  public static void postOrderTraversal(Node root, List<Integer> postOrder) {
    if (root == null) {
      return;
    }
    postOrderTraversal(root.left, postOrder);
    postOrderTraversal(root.right, postOrder);
    postOrder.add(root.data);

  }

  public static void main(String[] args) {
    Node root = new Node(4);
    root.left = new Node(2);
    root.right = new Node(5);
    root.left.left = new Node(3);
    root.left.left.right = new Node(9);
    root.left.left.right.left = new Node(1);
    root.right.left = new Node(7);
    root.right.right = new Node(6);
    root.right.right.left = new Node(8);

    List<Integer> postOrder = new ArrayList<>();

    postOrderTraversal(root, postOrder);
    System.out.print(postOrder);

  }

}
