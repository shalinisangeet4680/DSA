import java.util.HashSet;

public class TwoSum {
  public static String twoSumProblem(int[] nums, int target) {
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if (set.contains(target - nums[i])) {
        return "Yes";
      }
      set.add(nums[i]);
    }
    return "No";
  }

  public static void main(String[] args) {
    int[] nums = { 2, 6, 5, 8, 11 };
    int target = 15;

    String answer = twoSumProblem(nums, target);
    System.out.println(answer);
  }
}
