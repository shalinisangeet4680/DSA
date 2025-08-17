package Binary_Search;

public class SearchElementInSortedRotatedArray {
  public static int findElementInGivenArray(int[] nums, int k) {

    int low = 0, high = nums.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[mid] == k) {
        return mid;
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
    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 0, 1, 2, 3 };
    int k = 2;
    int answer = findElementInGivenArray(nums, k);
    System.out.println(answer);
  }

}
