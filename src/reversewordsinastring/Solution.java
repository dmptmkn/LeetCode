package reversewordsinastring;

import java.util.StringJoiner;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringJoiner reverseWords = new StringJoiner(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reverseWords.add(words[i]);
        }

        return reverseWords.toString();
    }

}
