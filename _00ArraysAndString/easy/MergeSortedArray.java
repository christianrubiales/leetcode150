package _00ArraysAndString.easy;

import java.util.Arrays;

/*
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n,
 * where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * https://leetcode.com/problems/merge-sorted-array
 * https://algo.monster/liteproblems/88
 */
public class MergeSortedArray {

    /*
     * Not too straightforward, but easy
     * Start from the end because we are reusing one of the arrays
     * O(m+n) time
     * O(1) space
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        m--;
        n--;
        while (m > -1 && n > -1) {
            if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m--];
            } else {
                nums1[i] = nums2[n--];
            }
            i--;
        }
        while (m > -1) {
            nums1[i--] = nums1[m--];
        }
        while (n > -1) {
            nums1[i--] = nums2[n--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        merge(nums1, 3, new int[]{2,5,6}, 3);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{1};
        merge(nums1, 1, new int[]{}, 0);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{0};
        merge(nums1, 0, new int[]{1}, 1);
        System.out.println(Arrays.toString(nums1));
    }
}
