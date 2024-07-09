package findthedifference;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("", "y"));
        System.out.println(findTheDifference("abcdef", "abcdwef"));
    }

    public static char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        char difference = tChars[tChars.length - 1];
        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]) {
                difference = tChars[i];
                break;
            }
        }

        return difference;
    }
}
