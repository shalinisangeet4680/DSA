public class MajorityElement {
  public static int findMajorityElement(int[] nums) {
    int n = nums.length;
    int count = 0;
    int element = 0;

    for (int i = 0; i < nums.length; i++) {
      if (count == 0) {
        count = 1;
        element = nums[i];
      } else if (element == nums[i]) {
        count++;
      } else {
        count--;
      }
    }

    int count1 = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == element) {
        count1++;
      }
    }

    if (count1 > n / 2) {
      return element;

    } else {
      return -1;
    }

  }

  public static void main(String[] args) {
    int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

    int answer = findMajorityElement(nums);
    System.out.println(answer);
  }

}
