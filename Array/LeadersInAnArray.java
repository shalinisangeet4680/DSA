import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {
  public static ArrayList<Integer> findLeadersInArray(int[] nums) {
    ArrayList<Integer> ans = new ArrayList<>();
    int n = nums.length;

    ans.add(nums[n - 1]);
    int maxi = nums[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      if (nums[i] > maxi) {
        ans.add(nums[i]);
        maxi = Math.max(maxi, nums[i]);
      }
    }
    Collections.reverse(ans);
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { 10, 22, 12, 3, 0, 6 };

    ArrayList<Integer> answer = findLeadersInArray(nums);
    for (int it : answer) {
      System.out.print(it + " ");
    }
  }
}
