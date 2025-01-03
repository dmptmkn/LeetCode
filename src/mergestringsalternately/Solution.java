package mergestringsalternately;

public class Solution {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        char[] merged = new char[word1.length() + word2.length()];
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        int pointer1 = 0;
        int pointer2 = 0;

        int i = 0;
        while (i < merged.length) {
            if (pointer1 < word1.length()) {
                merged[i++] = chars1[pointer1++];
            }
            if (pointer2 < word2.length()) {
                merged[i++] = chars2[pointer2++];
            }
        }

        return new String(merged);
    }
}
