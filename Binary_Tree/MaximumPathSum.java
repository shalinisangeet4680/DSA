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

public class MaximumPathSum {
  int maximumSumPath = 0;

  public int findMaxPathSum(Node root) {
    if (root == null) {
      return 0;
    }

    int leftSum = findMaxPathSum(root.left);
    int rightSum = findMaxPathSum(root.right);

    maximumSumPath = Math.max(maximumSumPath, root.data + leftSum + rightSum);

    return root.data + Math.max(leftSum, rightSum);

  }

  public int maximumPathSum(Node root) {
    if (root == null)
      return 0;
    findMaxPathSum(root);
    return maximumSumPath;

  }

  public static void main(String[] args) {
    Node root = new Node(-10);
    root.left = new Node(9);
    root.right = new Node(20);
    root.right.left = new Node(15);
    root.right.right = new Node(7);

    MaximumPathSum maxi = new MaximumPathSum();
    int ans = maxi.maximumPathSum(root);
    System.out.println(ans);
  }

}
