import java.util.Arrays;

public class MergeTwoSortedArraysWithoutSpace {
  public static void merge(int[] nums1, int[] nums2) {
    int n1 = nums1.length;
    int n2 = nums2.length;

    int i = n1 - 1;
    int j = 0;

    while (i >= 0 && j < n2) {
      if (nums1[i] > nums2[j]) {
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
        i--;
        j++;
      } else {
        i--;
        j++;
      }
    }
    Arrays.sort(nums1);
    Arrays.sort(nums2);
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 4, 8, 10 };
    int[] nums2 = { 2, 3, 9 };

    merge(nums1, nums2);

    for (int i = 0; i < nums1.length; i++) {
      System.out.print(nums1[i] + " ");
    }

    for (int i = 0; i < nums2.length; i++) {
      System.out.print(nums2[i] + " ");
    }

  }

}
