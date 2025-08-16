public class MissingNumber {
  public static int findMissingNumber(int n, int[] nums) {
    int summation = 0;
    int elementSum = 0;

    summation = (n * (n + 1)) / 2;

    for (int i = 0; i < nums.length; i++) {
      elementSum += nums[i];
    }
    return summation - elementSum;
  }

  public static void main(String[] args) {
    int n = 5;
    int[] nums = { 1, 2, 4, 5 };
    int answer = findMissingNumber(n, nums);
    System.out.println(answer);

  }

}
