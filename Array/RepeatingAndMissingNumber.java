public class RepeatingAndMissingNumber {
  public static int[] findRepeatingAndMissingNumber(int[] nums) {
    int[] ans = new int[2];

    int n = nums.length;

    long sum = (n * (n + 1)) / 2;
    long sumSquare = (n * (n + 1) * (2 * n + 1)) / 6;

    long sumEle = 0, sumSquareEle = 0;
    for (int i = 0; i < nums.length; i++) {
      sumEle += nums[i];
      sumSquareEle += (long) nums[i] * (long) nums[i];
    }

    long val1 = sumEle - sum;
    long val2 = sumSquareEle - sumSquare;

    val2 = val2 / val1;

    long x = (val1 + val2) / 2;
    long y = x - val1;
    ans[0] = (int) x;
    ans[1] = (int) y;

    return ans;

  }

  public static void main(String[] args) {
    int[] nums = { 3, 1, 2, 5, 4, 6, 7, 5 };

    int[] answer = findRepeatingAndMissingNumber(nums);
    for (int it : answer) {
      System.out.print(it + " ");
    }
  }

}
