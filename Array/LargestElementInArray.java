public class LargestElementInArray {
  public static int findLargestElemet(int[] nums) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      largest = Math.max(largest, nums[i]);
    }
    return largest;
  }

  public static void main(String[] args) {
    int[] nums = { 8, 10, 5, 7, 9 };

    int answer = findLargestElemet(nums);
    System.out.println(answer);

  }
}