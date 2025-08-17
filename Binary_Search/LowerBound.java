package Binary_Search;

class LowerBound {
  public static int findLowerBound(int[] nums, int x) {
    int low = 0, high = nums.length - 1;
    int answer = 0;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[mid] >= x) {
        answer = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 5, 8, 15, 19 };
    int x = 9;

    int ans = findLowerBound(nums, x);
    System.out.println(ans);

  }

}
