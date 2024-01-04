package _00ArraysAndString.easy;

/*
 * https://leetcode.com/problems/longest-common-prefix
 * https://algo.monster/liteproblems/14
 */
public class LongestCommonPrefix {

    /*
     * Not initial intuition, Internet solution
     * O(n * m) time, n - number of words, m - length of shortest word
     * O(m) space, m - length of shortest word
     */
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();

        // for each character in the first word
        for (int i = 0; i < strs[0].length(); i++) {
            // for each word
            for (int j = 0; j < strs.length; j++) {
                if (!(i < strs[j].length() && strs[j].charAt(i) == strs[0].charAt(i))) {
                    return builder.toString();
                }
            }
            builder.append(strs[0].charAt(i));
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));//fl
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));//fl
        System.out.println(longestCommonPrefix(new String[]{"dog1","dog","dog2"}));//fl
    }
}
