package _04Hashmap.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * s and t consist of any valid ascii character.
 */
public class IsomorphicStringsMine {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // char in s is not yet mapped
            if (!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (!map.containsKey(s.charAt(i)) || !map.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }
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
