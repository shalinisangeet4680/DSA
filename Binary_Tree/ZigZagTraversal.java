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

public class ZigZagTraversal {
  public static List<List<Integer>> zigZagTraversalOfBT(Node root) {
    List<List<Integer>> result = new ArrayList<>();
    Queue<Node> q = new LinkedList<>();

    boolean leftToRight = true;
    q.offer(root);

    while (!q.isEmpty()) {
      List<Integer> level = new ArrayList<>();

      int size = q.size();
      for (int i = 0; i < size; i++) {
        Node temp = q.poll();
        level.add(temp.data);

        if (temp.left != null)
          q.offer(temp.left);
        if (temp.right != null)
          q.offer(temp.right);

      }
      if (!leftToRight) {
        Collections.reverse(level);
      }
      result.add(level);

      leftToRight = !leftToRight;

    }
    return result;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.right = new Node(6);

    List<List<Integer>> answer = zigZagTraversalOfBT(root);
    for (List<Integer> list : answer) {
      System.out.print(list);
    }

  }

}
