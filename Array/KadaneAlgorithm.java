public class KadaneAlgorithm {
  public static int maximumSubarraySum(int[] nums) {
    int sum = 0;
    int maxSum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      if (sum < 0) {
        sum = 0;
      }

      maxSum = Math.max(sum, maxSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int answer = maximumSubarraySum(nums);
    System.out.println(answer);
  }

}
