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

public class LevelOrderTraversal {
  public static List<List<Integer>> levelOrderTRaversal(Node root) {
    Queue<Node> q = new LinkedList<>();
    List<List<Integer>> finalList = new ArrayList<>();

    if (root == null)
      return finalList;

    q.offer(root);

    while (!q.isEmpty()) {
      ArrayList<Integer> levelsList = new ArrayList<>();

      int size = q.size();
      for (int i = 0; i < size; i++) {
        if (q.peek().left != null)
          q.offer(q.peek().left);
        if (q.peek().right != null)
          q.offer(q.peek().right);

        int ele = q.poll().data;
        levelsList.add(ele);
      }
      finalList.add(levelsList);
    }
    return finalList;
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

    List<List<Integer>> answer = levelOrderTRaversal(root);
    for (List<Integer> list : answer) {
      System.out.print(list);
    }
  }

}
