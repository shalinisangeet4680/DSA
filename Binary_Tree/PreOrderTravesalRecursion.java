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

public class PreOrderTravesalRecursion {

  public static void preOrderTraversal(Node root, List<Integer> preOrder) {

    Node temp = root;
    if (temp == null) {
      return;
    }
    preOrder.add(temp.data);
    preOrderTraversal(temp.left, preOrder);
    preOrderTraversal(temp.right, preOrder);

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

    List<Integer> preOrder = new ArrayList<>();

    preOrderTraversal(root, preOrder);
    System.out.print(preOrder);

  }

}
