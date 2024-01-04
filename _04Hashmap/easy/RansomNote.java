package _04Hashmap.easy;

/*
 * Given two strings ransomNote and magazine,
 * return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 * ransomNote and magazine consist of lowercase English letters.
 * https://leetcode.com/problems/ransom-note
 * https://algo.monster/liteproblems/383
 */
public class RansomNote {

    /*
     * O(n) time, n - characters in magazine
     * O(1) space
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] counter = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            counter[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            counter[index]--;
            if (counter[index] < 0) {
                return  false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));// false
        System.out.println(canConstruct("a", "b"));// false
        System.out.println(canConstruct("aa", "aab"));// true
        System.out.println(canConstruct("aab", "aa"));// false
    }
}
