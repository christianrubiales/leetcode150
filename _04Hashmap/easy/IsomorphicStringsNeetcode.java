package _04Hashmap.easy;

/*
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * s and t consist of any valid ascii character.
 */
public class IsomorphicStringsNeetcode {
    public static boolean isIsomorphic(String s, String t) {
        char[] mapST = new char[256];
        char[] mapTS = new char[256];

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char c1 = sArr[i];
            char c2 = tArr[i];
            if ((mapST[c1] != 0 && mapST[c1] != c2)
                    || (mapTS[c2] != 0 && mapTS[c2] != c1)) {
                return false;
            }
            mapST[c1] = c2;
            mapTS[c2] = c1;
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
