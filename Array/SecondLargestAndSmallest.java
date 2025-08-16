public class SecondLargestAndSmallest {
  public static int[] findSecondLargestAndSecondSmallest(int[] nums) {
    int[] ans = new int[2];
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < smallest) {
        secondSmallest = smallest;
        smallest = nums[i];
      } else if (nums[i] < secondSmallest && nums[i] != smallest) {
        secondSmallest = nums[i];
      }

      if (nums[i] > largest) {
        secondLargest = largest;
        largest = nums[i];
      } else if (nums[i] > secondLargest && nums[i] != largest) {
        secondLargest = nums[i];
      }

    }
    ans[0] = secondSmallest;
    ans[1] = secondLargest;

    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 4, 7, 7, 5 };

    int[] ans = findSecondLargestAndSecondSmallest(nums);

    for (int it : ans) {
      System.out.print(it + " ");
    }

  }
}
