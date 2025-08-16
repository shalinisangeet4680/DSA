public class SetMatrixZero {
  public static int[][] setMatrixZeroProblem(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;

    int[] rowMatrix = new int[n];
    int[] colMatrix = new int[m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix[i][j] == 0) {
          rowMatrix[i] = 1;
          colMatrix[j] = 1;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (rowMatrix[i] == 1 || colMatrix[j] == 1) {
          matrix[i][j] = 0;
        }
      }
    }
    return matrix;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
    int[][] answer = setMatrixZeroProblem(matrix);

    for (int i = 0; i < answer.length; i++) {
      for (int j = 0; j < answer[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
