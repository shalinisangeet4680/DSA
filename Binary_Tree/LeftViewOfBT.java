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

public class LeftViewOfBT {
  public static List<Integer> findLeftViewOfBT(Node root) {
    List<Integer> res = new ArrayList<>();
    Queue<Node> q = new LinkedList<>();

    q.offer(root);
    while (!q.isEmpty()) {
      int size = q.size();

      for (int i = 0; i < size; i++) {
        Node temp = q.poll();

        if (temp.left != null)
          q.offer(temp.left);
        if (temp.right != null)
          q.offer(temp.right);

        if (i == 0)
          res.add(temp.data);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(10);
    root.left.left.right = new Node(5);
    root.left.left.right.right = new Node(6);
    root.right.left = new Node(9);
    root.right.right = new Node(11);

    List<Integer> ans = findLeftViewOfBT(root);
    System.out.println(ans);

  }

}
