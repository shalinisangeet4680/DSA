public class LeftRotateByOne {
  public static int[] findLeftRotatedArrayByOnePlace(int[] nums) {

    int temp = nums[0];

    for (int i = 0; i < nums.length - 1; i++) {
      nums[i] = nums[i + 1];
    }
    nums[nums.length - 1] = temp;

    return nums;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };

    int[] answer = findLeftRotatedArrayByOnePlace(nums);

    for (int it : answer) {
      System.out.print(it + " ");
    }
  }

}
