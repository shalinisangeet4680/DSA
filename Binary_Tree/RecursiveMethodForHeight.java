package Binary_Tree;

public class RecursiveMethodForHeight {
  public static int heightOfBT(Node root) {
    Node node = root;
    if (node == null)
      return 0;

    int lh = heightOfBT(node.left);
    int rh = heightOfBT(node.right);

    return 1 + Math.max(lh, rh);

  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.right.left = new Node(4);
    root.right.right = new Node(6);
    root.right.left.left = new Node(5);

    int answer = heightOfBT(root);
    System.out.print(answer);
  }

}
