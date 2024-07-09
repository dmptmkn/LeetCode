package reversewordsinastringiii;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWordsShorter("Mr Ding"));
        System.out.println(reverseWordsStream("Let's take LeetCode contest"));
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

    public static String reverseWordsStream(String s) {
        return Arrays.stream(s.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
