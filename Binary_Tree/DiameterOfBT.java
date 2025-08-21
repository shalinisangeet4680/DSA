package Binary_Tree;

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

public class DiameterOfBT {
  int diameter = 0;

  public int height(Node root) {
    if (root == null)
      return 0;
    int lh = height(root.left);
    int rh = height(root.right);

    diameter = Math.max(diameter, lh + rh);

    return 1 + Math.max(lh, rh);
  }

  public int findDiameter(Node root) {
    height(root);

    return diameter;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.right.left = new Node(4);
    root.right.left.left = new Node(5);
    root.right.left.left.left = new Node(6);
    root.right.right = new Node(7);
    root.right.right.right = new Node(8);
    root.right.right.right.right = new Node(9);

    DiameterOfBT answer = new DiameterOfBT();

    int ans = answer.findDiameter(root);
    System.out.println(ans);

  }

}
