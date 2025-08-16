import java.util.HashMap;

public class LengthOfLongestSubarray {
  public static int lengthOfLongestSubarrayWithSumZero(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();

    int maxi = 0;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      if (sum == 0) {
        maxi = i + 1;
      } else {
        if (map.get(sum) != null) {
          maxi = Math.max(maxi, i - map.get(sum));
        } else {
          map.put(sum, i);
        }
      }

    }
    return maxi;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, -2, 4, -4 };
    int answer = lengthOfLongestSubarrayWithSumZero(nums);
    System.out.println(answer);
  }
}
