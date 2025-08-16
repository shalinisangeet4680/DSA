public class LongestSubarray {
  public static int findLongestSubarrayWithGivenSum(int k, int[] nums) {
    int maxlength = 0;

    int left = 0;

    int sum = 0;
    for (int right = 0; right < nums.length; right++) {
      sum += nums[right];

      while (sum > k) {
        sum -= nums[left];
        left++;
      }
      if (sum == k) {
        maxlength = Math.max(maxlength, right - left + 1);
      }
    }
    return maxlength;
  }

  public static void main(String[] args) {
    int k = 5;
    int[] nums = { 2, 3, 5 };
    int answer = findLongestSubarrayWithGivenSum(k, nums);
    System.out.println(answer);
  }

}
