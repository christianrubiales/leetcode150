package _00ArraysAndString.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean found = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));//0
        System.out.println(strStr("012345sad", "sad"));//6
        System.out.println(strStr("123", "123465"));//-1
        System.out.println(strStr("0123456", "sad"));//-1
    }
}
