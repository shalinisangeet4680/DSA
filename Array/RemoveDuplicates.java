public class RemoveDuplicates {
  public static int removeDuplicates(int[] nums) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 2, 2, 3, 3 };
    int answer = removeDuplicates(nums);
    System.out.println(answer);

  }

}
