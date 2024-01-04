package _04Hashmap.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * s and t consist of any valid ascii character.
 * https://leetcode.com/problems/isomorphic-strings
 * https://algo.monster/liteproblems/205
 * Neetcode
 */
public class IsomorphicStrings {

    /*
     * Internet answer, lots of cleverness
     * The trick to know:
     * Is s is isomorphic to t, t is also isomorphic to s
     * The mapping from s to t, must have the inverse mapping from t to s
     * Use 2 maps
     * O(n) time, n - length of one string
     * O(m) space, m - the number of unique characters in the strings
     */
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);

            // if there is a mapping but the mapping is not to the correct character in the other string
            if ((mapST.containsKey(sChar) && mapST.get(sChar) != tChar)
                || (mapTS.containsKey(tChar) && mapTS.get(tChar) != sChar)) {
                return false;
            }

            // put the mappings in both maps
            mapST.put(sChar, tChar);
            mapTS.put(tChar, sChar);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));// true
        System.out.println(isIsomorphic("foo", "bar"));// false
        System.out.println(isIsomorphic("paper", "title"));// true
        System.out.println(isIsomorphic("badc", "baba"));// false
    }
}
