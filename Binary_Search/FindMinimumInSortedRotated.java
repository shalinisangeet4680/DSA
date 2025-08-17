package Binary_Search;

public class FindMinimumInSortedRotated {
  public static int findMinimumInSortedRotatedArray(int[] nums) {
    int mini = Integer.MAX_VALUE;

    int low = 0, high = nums.length - 1;

    if (nums[low] < nums[high]) {
      mini = Math.min(mini, nums[low]);
    }

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[low] <= nums[mid]) {
        mini = Math.min(nums[low], mini);
        low = mid + 1;
      } else {
        mini = Math.min(nums[mid], mini);
        high = mid - 1;
      }
    }
    return mini;

  }

  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 1, 2, 3 };
    int answer = findMinimumInSortedRotatedArray(nums);
    System.out.println(answer);
  }

}
