public class MoveZeros {
  public static int[] moveAllZerosToEnd(int[] nums) {
    int firstZeroIndex = -1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        firstZeroIndex = i;
        break;
      }

    }

    for (int j = firstZeroIndex + 1; j < nums.length; j++) {
      if (nums[j] != 0) {
        int temp = nums[j];
        nums[j] = nums[firstZeroIndex];
        nums[firstZeroIndex] = temp;
        firstZeroIndex++;
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 0, 1, 0, 4, 0 };
    int[] answer = moveAllZerosToEnd(nums);
    for (int it : answer) {
      System.out.print(it + " ");
    }

  }

}
