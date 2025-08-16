public class LeftRotateByD {
  public static void reverse(int[] nums, int start, int end) {
    while (start <= end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

  public static int[] findLeftRotatedArrayByDlaces(int[] nums, int k) {

    int n = nums.length;
    k = k % n;

    reverse(nums, 0, n - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, n - 1);

    return nums;

  }

  public static void main(String[] args) {
    int[] nums = { 3, 7, 8, 9, 10, 11 };
    int k = 3;

    int[] answer = findLeftRotatedArrayByDlaces(nums, k);

    for (int it : answer) {
      System.out.print(it + " ");
    }
  }
}
