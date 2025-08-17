package Binary_Search;

public class FirstAndLastOccurrences {
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

  public static void main(String[] args) {
    int[] nums = { 3, 4, 13, 13, 13, 20, 40 };
    int target = 60;
    int[] ans = new int[2];
    ans[0] = firstOccurrence(nums, target);
    ans[1] = lastOccurrence(nums, target);

    System.out.print(ans[0] + " " + ans[1]);

  }

}
