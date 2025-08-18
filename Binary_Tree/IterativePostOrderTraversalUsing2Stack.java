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

public class IterativePostOrderTraversalUsing2Stack {
  public static List<Integer> iterativePostOrderTraversal(Node root) {
    ArrayList<Integer> postOrder = new ArrayList<>();
    Stack<Node> st1 = new Stack<>();
    Stack<Node> st2 = new Stack<>();

    st1.push(root);
    while (!st1.isEmpty()) {
      Node temp = st1.pop();
      st2.push(temp);

      if (temp.left != null)
        st1.push(temp.left);
      if (temp.right != null)
        st1.push(temp.right);
    }

    while (!st2.isEmpty()) {
      postOrder.add(st2.pop().data);
    }
    return postOrder;
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

    List<Integer> list = iterativePostOrderTraversal(root);
    System.out.print(list);

  }

}
