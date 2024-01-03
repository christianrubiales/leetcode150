package _00ArraysAndString.easy;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/remove-element
 * https://algo.monster/liteproblems/27
 */
public class RemoveElement {

    /*
     * Internet solution, requires knowing the trick
     * Which is to move the pointer if the number is not to be removed
     * O(n) time
     * O(1) space
     */
    public static int removeElement(int[] nums, int val) {
        int toRetain = 0;

        for (int num : nums) {
            if (num != val) {
                nums[toRetain] = num;
                toRetain++; // move the pointer to the next slot
            }
        }

        return toRetain;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        removeElement(nums, 3);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0,1,2,2,3,0,4,2};
        removeElement(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
