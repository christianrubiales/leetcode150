package _00ArraysAndString.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/roman-to-integer
 * https://algo.monster/liteproblems/13
 */
public class RomanToInteger {

    /*
     * Trust what you know
     * If the current number >= next number, add to result
     * If less, subtract from result
     * It doesn't matter if iterating forwards or backwards
     * You know the forwards iteration version
     * O(n) time
     * O(1) space
     */
    public static int romanToInt(String s) {
        int result = 0;
        int length = s.length();
        Map<Character, Integer> mapping = Map.of('M', 1000, 'D', 500, 'C', 100, 'L', 50, 'X', 10, 'V', 5, 'I', 1);

        for (int i = 0; i < length; i++) {
            int value = mapping.get(s.charAt(i));
            if (i < length - 1) {
                int next = mapping.get(s.charAt(i+1));
                result += (value >= next) ? value : -value;
            } else {
                result += value;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));//3
        System.out.println(romanToInt("LVIII"));//58
        System.out.println(romanToInt("MCMXCIV"));//1994
    }
}
