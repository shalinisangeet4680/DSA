package Binary_Search;

public class SearchEleInSortedRotated2 {
  public static boolean findElementInSortedRotatedArray(int[] nums, int k) {
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[mid] == k) {
        return true;
      }

      if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
        low = low + 1;
        high = high - 1;
        continue;
      }

      if (nums[low] < nums[mid]) {
        if (nums[low] <= k && k <= nums[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else {
        if (nums[mid] <= k && k <= nums[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] nums = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6 };
    int k = 10;

    boolean answer = findElementInSortedRotatedArray(nums, k);
    System.out.println(answer);
  }

}
