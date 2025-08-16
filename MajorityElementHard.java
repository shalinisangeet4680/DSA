public class MajorityElementHard {
  public static int majorityElement(int[] nums) {
    int count1 = 0, count2 = 0;
    int ele1 = Integer.MIN_VALUE;
    int ele2 = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (count1 == 0 && ele2 != nums[i]) {
        count1 = 1;
        ele1 = nums[i];
      } else if (count2 == 0 && ele1 != nums[i]) {
        count2 = 1;
        ele2 = nums[i];
      } else if (nums[i] == ele1) {
        count1++;
      } else if (nums[i] == ele2) {
        count2++;

      } else {
        count1--;
        count2--;
      }
    }

    count1 = 0;
    count2 = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == ele1)
        count1++;
      if (nums[i] == ele2)
        count2++;
    }

    int mini = (int) (nums.length / 3) + 1;
    if (count1 >= mini) {
      return ele1;
    } else {
      return ele2;
    }

  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 3, 2 };
    int answer = majorityElement(nums);
    System.out.println(answer);

  }

}
