package _00ArraysAndString.easy;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * https://algo.monster/liteproblems/26
 */
public class RemoveDuplicatesFromSortedArray {

    /*
     * Internet answer
     * Start iterating from the 2nd item
     * If the current item is not the same as THE ONE BEFORE IT (not the one at the current pointer),
     * Set that number to the current pointer
     * Increment the pointer
     * The number of increments made is the same as the number of non-duplicates
     * O(n) time
     * O(1) space
     */
    public static int removeDuplicates(int[] nums) {
        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

        nums = new int[]{1,1};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
