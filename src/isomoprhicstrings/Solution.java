package isomoprhicstrings;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        return Arrays.equals(computeMorphe(s), computeMorphe(t));
    }

    public static int[] computeMorphe(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> uniqueChars = new HashMap<>();

        int[] morphe = new int[chars.length];
        for (int i = 0, morpheValue = 0; i < chars.length; i++) {
            if (!uniqueChars.containsKey(chars[i])) {
                uniqueChars.put(chars[i], morpheValue++);
            }
            morphe[i] = uniqueChars.get(chars[i]);
        }

        return morphe;
    }
}
