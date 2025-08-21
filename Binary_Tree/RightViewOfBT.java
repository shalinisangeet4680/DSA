package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class RightViewOfBT {
  public static List<Integer> findRightViewOfBT(Node root) {
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

        if (i == size - 1)
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

    List<Integer> ans = findRightViewOfBT(root);
    System.out.println(ans);

  }

}
