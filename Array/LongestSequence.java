import java.util.HashSet;

public class LongestSequence {
  public static int findLongestSequenceInAnArray(int[] nums) {
    int longest = 0;
    int count = 0;

    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      set.add(nums[i]);
    }

    for (int it : set) {
      if (!set.contains(it - 1)) {
        count = 1;
        int x = it;

        while (set.contains(x + 1)) {
          x = x + 1;
          count++;

        }
        longest = Math.max(longest, count);
      }

    }
    return longest;
  }

  public static void main(String[] args) {
    int[] nums = { 100, 200, 1, 3, 2, 4 };
    int answer = findLongestSequenceInAnArray(nums);
    System.out.println(answer);
  }

}
