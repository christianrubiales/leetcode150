package _00ArraysAndString.easy;

/*
 * https://leetcode.com/problems/longest-common-prefix
 * https://algo.monster/liteproblems/14
 */
public class LongestCommonPrefixUsingWhileLoops {

    /*
     * A bit more convoluted than using for loops
     * O(n * m) time, n - number of words, m - length of shortest word
     * O(m) space, m - length of shortest word
     */
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();

        int j = 0;
        boolean toBreak = false;
        while (!toBreak) {
            for (int i = 0; i < strs.length; i++) {
                if (!(j < strs[i].length() && strs[i].charAt(j) == strs[0].charAt(j))) {
                    toBreak = true;
                    break;
                }
            }
            if (toBreak) {
                break;
            } else {
                builder.append(strs[0].charAt(j));
                j++;
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));//fl
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));//fl
        System.out.println(longestCommonPrefix(new String[]{"dog1","dog","dog2"}));//fl
    }
}
