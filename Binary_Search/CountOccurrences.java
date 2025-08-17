package Binary_Search;

public class CountOccurrences {
  public static int firstOccurrence(int[] nums, int target) {
    int answer = -1;
    int low = 0, high = nums.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[mid] == target) {
        answer = mid;
        high = mid - 1;

      } else if (nums[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }

    }
    return answer;

  }

  public static int lastOccurrence(int[] nums, int target) {
    int answer = -1;

    int low = 0, high = nums.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[mid] == target) {
        answer = mid;
        low = mid + 1;

      } else if (nums[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return answer;
  }

  public static int countOccurrences(int[] nums, int target) {
    int first = firstOccurrence(nums, target);
    int second = lastOccurrence(nums, target);

    return second - first + 1;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 2, 3, 3, 3, 3, 4 };
    int target = 3;

    int ans = countOccurrences(nums, target);
    System.out.print(ans);
  }

}
