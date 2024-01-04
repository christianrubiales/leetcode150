package _00ArraysAndString.easy;

/*
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring  consisting of non-space characters only.
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s
 * https://leetcode.com/problems/length-of-last-word
 * https://algo.monster/liteproblems/58
 */
public class LengthOfLastWord {

    /*
     * Iterate from the end
     * Two while loops, without too much cleverness
     * O(n) time
     * O(1) space
     */
    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // while there are trailing spaces
        while (i > -1 && s.charAt(i) == ' ') {
            i--;
        }
        // while there are non-space characters
        while (i > -1 && s.charAt(i) != ' ') {
            i--;
            length++;
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));//5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));//4
        System.out.println(lengthOfLastWord("luffy is still joyboy"));//6
        System.out.println(lengthOfLastWord("123456"));//6
        System.out.println(lengthOfLastWord(" 1234567 "));//7
    }
}
