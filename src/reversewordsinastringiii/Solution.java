package reversewordsinastringiii;

import java.util.StringJoiner;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWordsShorter("Mr Ding"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        StringBuilder reverseWords = new StringBuilder();
        for (String word : words) {
            reverseWords.append(word);
            reverseWords.append(" ");
        }

        return reverseWords.toString().trim();
    }

    public static String reverseWordsShorter(String s) {
        String[] words = s.split(" ");
        StringJoiner reverseWords = new StringJoiner(" ");
        for (String word : words) reverseWords.add(new StringBuilder(word).reverse().toString());

        return reverseWords.toString();
    }
}
