package reversewordsinastringiii;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("Mr Ding"));
    }

    public static String reverseWords(String s) {
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            split[i] = new StringBuilder(split[i]).reverse().toString();
        }

        StringBuilder builder = new StringBuilder();
        for (String word : split) {
            builder.append(word);
            builder.append(" ");
        }

        return builder.toString().trim();
    }
}
