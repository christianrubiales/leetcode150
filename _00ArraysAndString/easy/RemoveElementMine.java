package _00ArraysAndString.easy;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/remove-element
 * https://algo.monster/liteproblems/27
 */
public class RemoveElementMine {
    /*
     * Straightforward based on what someone will think of when starting both pointers at the start
     * But could have danger with indexing and edge cases
     * Requires two passes
     * The internet solution is only one pass
     * O(n) time
     * O(1) space
     */
    public static int removeElement(int[] nums, int val) {
        int retainIndex = 0;
        int removeIndex = 0;
        int length = nums.length;

        while (retainIndex < length && removeIndex < length) {
            while (retainIndex < length && nums[retainIndex] == val) {
                retainIndex++;
            }
            while (removeIndex < length && nums[removeIndex] != val) {
                removeIndex++;
            }
            // swap
            if (retainIndex < length && removeIndex < length && retainIndex > removeIndex) {
                int temp = nums[retainIndex];
                nums[retainIndex] = nums[removeIndex];
                nums[removeIndex] = temp;
            } else {
                retainIndex++;
            }
        }

        int toRetain = 0;
        while (toRetain < length && nums[toRetain] != val) {
            toRetain++;
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
