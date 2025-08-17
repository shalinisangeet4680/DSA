package Binary_Search;

public class SearchInsertPosition {
  public static int findInsertedPosition(int[] nums, int x) {
    int n = nums.length;
    int low = 0, high = n - 1;
    int answer = n - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[mid] == x) {
        return mid;
      } else if (nums[mid] > x) {
        answer = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }

    }
    return answer;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 4, 7 };
    int x = 2;
    int ans = findInsertedPosition(nums, x);
    System.out.println(ans);

  }

}
