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

public class IterativeInOrderTraversal {
  public static List<Integer> iterativeInOrderTraversal(Node root) {
    List<Integer> inOrder = new ArrayList<>();

    Stack<Node> st = new Stack<>();
    if (root == null)
      return inOrder;

    Node node = root;
    st.push(node);

    while (!st.isEmpty()) {
      while (node != null) {
        st.push(node);
        node = node.left;
      }
      node = st.pop();
      inOrder.add(node.data);
      node = node.right;
    }
    return inOrder;
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

    List<Integer> answer = iterativeInOrderTraversal(root);
    System.out.print(answer);

  }

}
