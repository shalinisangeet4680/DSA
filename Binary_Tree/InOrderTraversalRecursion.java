package Binary_Tree;

import java.util.*;

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

public class InOrderTraversalRecursion {
  public static void inOrderTraversal(Node root, List<Integer> inOrder) {
    if (root == null) {
      return;
    }
    inOrderTraversal(root.left, inOrder);
    inOrder.add(root.data);
    inOrderTraversal(root.right, inOrder);
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

    List<Integer> inOrder = new ArrayList<>();
    inOrderTraversal(root, inOrder);
    System.out.print(inOrder);

  }

}
