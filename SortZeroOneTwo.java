public class SortZeroOneTwo {
  public static int[] sortArray(int[] nums) {
    int n = nums.length;
    int low = 0;
    int mid = 0;
    int high = n - 1;

    while (mid <= high) {
      if (nums[mid] == 0) {
        int temp = nums[mid];
        nums[mid] = nums[low];
        nums[low] = temp;
        low++;
        mid++;
      } else if (nums[mid] == 1) {
        mid++;
      } else {
        int temp = nums[mid];
        nums[mid] = nums[high];
        nums[high] = temp;
        high--;
      }
    }
    return nums;

  }

  public static void main(String[] args) {
    int[] nums = { 2, 0, 2, 1, 1, 0 };
    int[] answer = sortArray(nums);
    for (int it : answer) {
      System.out.print(it + " ");
    }
  }

}
