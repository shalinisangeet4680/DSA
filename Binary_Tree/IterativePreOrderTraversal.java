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

public class IterativePreOrderTraversal {
  public static List<Integer> iterativePreOrderTraversal(Node root) {
    List<Integer> preOrder = new ArrayList<>();

    Stack<Node> st = new Stack<>();

    st.push(root);

    while (!st.isEmpty()) {
      Node temp = st.pop();
      if (temp.right != null)
        st.push(temp.right);
      if (temp.left != null)
        st.push(temp.left);
      preOrder.add(temp.data);

    }
    return preOrder;
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

    List<Integer> answer = iterativePreOrderTraversal(root);
    System.out.print(answer);
  }

}
