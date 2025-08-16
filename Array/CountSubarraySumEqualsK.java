public class CountSubarraySumEqualsK {
  public static int findCountOfSubarraySumEqualsK(int[] nums, int k) {
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];

        if (sum == k) {
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 1, 2, 4 };
    int k = 6;

    int answer = findCountOfSubarraySumEqualsK(nums, k);
    System.out.println(answer);

  }

}
