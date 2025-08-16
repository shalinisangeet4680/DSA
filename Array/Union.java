import java.util.*;

public class Union {
  // public static int[] union(int[] nums1, int[] nums2) {
  // HashSet<Integer> set = new HashSet<>();

  // for (int i = 0; i < nums1.length; i++) {
  // set.add(nums1[i]);
  // }

  // for (int i = 0; i < nums2.length; i++) {
  // set.add(nums2[i]);
  // }

  // int n = set.size();
  // int index = 0;
  // int[] nums = new int[n];
  // for (int it : set) {
  // nums[index] = it;
  // index++;
  // }

  // return nums;
  // }

  public static ArrayList<Integer> union(int[] nums1, int[] nums2) {
    ArrayList<Integer> ans = new ArrayList<>();
    int n1 = nums1.length;
    int n2 = nums2.length;

    int i = 0, j = 0;

    while (i < n1 && j < n2) {
      if (nums1[i] <= nums2[j]) {
        if (ans.size() == 0 || ans.get(ans.size() - 1) != nums1[i]) {
          ans.add(nums1[i]);

        }
        i++;

      } else {
        if (ans.size() == 0 || ans.get(ans.size() - 1) != nums2[j]) {
          ans.add(nums2[j]);

        }
        j++;

      }
    }

    while (i < n1) {
      if (ans.get(ans.size() - 1) != nums1[i]) {
        ans.add(nums1[i]);

      }
      i++;

    }
    while (j < n2) {
      if (ans.get(ans.size() - 1) != nums2[j]) {
        ans.add(nums2[j]);

      }
      j++;

    }
    return ans;
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 4, 5 };
    int[] nums2 = { 2, 3, 4, 4, 5, 6 };

    ArrayList<Integer> answer = union(nums1, nums2);
    for (int it : answer) {
      System.out.print(it + " ");
    }

  }

}
