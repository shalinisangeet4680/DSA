import java.util.ArrayList;

public class RearrangeElements {
  public static int[] rearrangeBySign(int[] nums) {
    ArrayList<Integer> posNumber = new ArrayList<>();
    ArrayList<Integer> negNumber = new ArrayList<>();
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      if (nums[i] < 0) {
        negNumber.add(nums[i]);
      } else {
        posNumber.add(nums[i]);
      }
    }
    int size = Math.min(posNumber.size(), negNumber.size());
    for (int i = 0; i < size; i++) {
      nums[2 * i] = posNumber.get(i);
      nums[2 * i + 1] = negNumber.get(i);

    }
    return nums;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, -4, -5 };

    int[] answer = rearrangeBySign(nums);
    for (int it : answer) {
      System.out.print(it + " ");
    }

  }

}
