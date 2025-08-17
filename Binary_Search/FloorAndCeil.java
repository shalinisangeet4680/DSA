package Binary_Search;

public class FloorAndCeil {
  public static int findFloor(int[] nums, int x) {
    int low = 0;
    int high = nums.length - 1;
    int answer = 0;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[mid] == x) {
        return nums[mid];
      }

      if (nums[mid] < x) {
        answer = nums[mid];
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return answer;
  }

  public static int findCeil(int[] nums, int x) {
    int low = 0;
    int high = nums.length - 1;
    int answer = 0;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[mid] == x) {
        return nums[mid];
      }

      if (nums[mid] > x) {
        answer = nums[mid];
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 4, 4, 7, 8, 10 };
    int x = 8;
    int[] ans = new int[2];
    ans[0] = findFloor(nums, x);
    ans[1] = findCeil(nums, x);

    System.out.print(ans[0] + " " + ans[1]);
  }

}
