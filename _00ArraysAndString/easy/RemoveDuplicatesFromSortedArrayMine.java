package _00ArraysAndString.easy;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * https://algo.monster/liteproblems/26
 */
public class RemoveDuplicatesFromSortedArrayMine {

    /*
     * Straightforward without tricks
     * The one with tricks is not too intuitive, although simple
     */
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = 1;
        int checked = 1;

        while (right < length) {
            // while duplicate found, keep going right
            while (right < length && nums[left] == nums[right]) {
                right++;
            }
            if (right < length) {
                left++;
                // swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right++;
                checked++;
            }
        }

        return checked;
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
