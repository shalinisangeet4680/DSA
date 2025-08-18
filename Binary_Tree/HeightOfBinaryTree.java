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

public class HeightOfBinaryTree {
  public static int findHeight(Node root) {
    int levels = 0;

    Queue<Node> q = new LinkedList<>();

    q.offer(root);
    while (!q.isEmpty()) {
      int size = q.size();

      for (int i = 0; i < size; i++) {
        if (q.peek().left != null)
          q.offer(q.peek().left);
        if (q.peek().right != null)
          q.offer(q.peek().right);

        q.poll();
      }
      levels++;
    }
    return levels;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.right.left = new Node(4);
    root.right.right = new Node(6);
    root.right.left.left = new Node(5);
    int answer = findHeight(root);
    System.out.println(answer);

  }

}
