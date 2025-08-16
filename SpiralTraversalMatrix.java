import java.util.ArrayList;

public class SpiralTraversalMatrix {
  public static ArrayList<Integer> findSpiralTraversalOfMatrix(int[][] matrix) {
    ArrayList<Integer> ans = new ArrayList<>();
    int n = matrix.length;
    int m = matrix[0].length;

    int top = 0, right = m - 1, left = 0, bottom = n - 1;

    while (top <= bottom && left <= right) {

      // for moving left to right
      for (int i = left; i <= right; i++) {
        ans.add(matrix[top][i]);

      }
      top++;

      // for moving top to bottom

      for (int i = top; i <= bottom; i++) {
        ans.add(matrix[i][right]);
      }
      right--;

      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          ans.add(matrix[bottom][i]);
        }
        bottom--;
      }

      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          ans.add(matrix[i][left]);
        }
        left++;
      }
    }

    return ans;

  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

    ArrayList<Integer> answer = findSpiralTraversalOfMatrix(matrix);
    for (int it : answer) {
      System.out.print(it + " ");
    }

  }
}
