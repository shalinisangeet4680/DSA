public class RotateImage {
  public static void rotateImageBy90(int[][] matrix) {

    int n = matrix.length;
    int m = matrix[0].length;

    // Transpose of matrix

    for (int i = 0; i < n; i++) {
      for (int j = i; j < m; j++) {
        int temp = 0;
        temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    // Reverse of matrix
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m / 2; j++) {
        int temp = 0;
        temp = matrix[i][j];
        matrix[i][j] = matrix[i][n - 1 - j];
        matrix[i][n - 1 - j] = temp;
      }
    }

  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    rotateImageBy90(matrix);

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");

      }
      System.out.println();
    }

  }

}
