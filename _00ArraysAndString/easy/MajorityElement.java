package _00ArraysAndString.easy;

/*
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
public class MajorityElement {

    /*
     * Boyer-Moore algorithm
     * O(n) time
     * O(1) space
     */
    public static int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majority = nums[i];
                    count = 1;
                }
            }
        }

        return majority;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));//3
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));//2
    }
}
