package _04Hashmap.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * pattern contains only lower-case English letters.
 * s contains only lowercase English letters and spaces ' '.
 * s does not contain any leading or trailing spaces.
 * All the words in s are separated by a single space.
 * https://leetcode.com/problems/word-pattern
 * https://algo.monster/liteproblems/290
 * Neetcode
 */
public class WordPattern {

    /*
     * Similar to isomorphic strings
     * O(n) time, single pass through the pattern and the string
     * O(m) space wrt the number of unique characters in pattern or number of unique words in string
     */
    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        Map<Character, String> mapPS = new HashMap<>();
        Map<String, Character> mapSP = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = arr[i];

            if ((mapPS.containsKey(c) && !mapPS.get(c).equals(word))
                || (mapSP.containsKey(word) && !mapSP.get(word).equals(c))) {
                return false;
            }
            mapPS.put(c, word);
            mapSP.put(word, c);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(wordPattern("abba", "dog dog dog dog")); // false
    }
}
