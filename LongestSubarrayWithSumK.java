public class LongestSubarrayWithSumK {
  public static int longestSubarrayWithNegAndPosEle(int k, int[] nums) {
    int maxLength = 0;
    int left = 0;
    int sum = 0;
    for (int right = 0; right < nums.length; right++) {
      sum += nums[right];

      if (sum == k) {
        maxLength = Math.max(maxLength, right - left + 1);
      }
    }
    return maxLength;
  }

  public static void main(String[] args) {
    int k = 1;
    int[] nums = { -1, 1, 1 };
    int answer = longestSubarrayWithNegAndPosEle(k, nums);
    System.out.println(answer);
  }
}
