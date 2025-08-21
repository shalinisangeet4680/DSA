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

public class CheckIfIdentical {
  public static boolean checkIfTwoTreesIdentical(Node root1, Node root2) {

    if (root1 == null && root2 == null)
      return true;
    if (root1 == null && root2 != null)
      return false;
    if (root1 != null && root2 == null)
      return false;

    boolean left = checkIfTwoTreesIdentical(root1.left, root2.left);
    boolean right = checkIfTwoTreesIdentical(root1.right, root2.right);

    return (root1.data == root2.data) && left && right;
  }

  public static void main(String[] args) {
    Node root1 = new Node(1);
    root1.left = new Node(2);
    root1.right = new Node(3);
    root1.right.left = new Node(4);
    root1.right.right = new Node(5);

    Node root2 = new Node(1);
    root2.left = new Node(2);
    root2.right = new Node(3);
    root2.right.left = new Node(5);
    root2.right.right = new Node(4);

    boolean answer = checkIfTwoTreesIdentical(root1, root2);
    System.out.println(answer);
  }

}
