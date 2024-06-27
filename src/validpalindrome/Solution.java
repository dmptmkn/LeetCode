package validpalindrome;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("A_ha"));
        System.out.println(isPalindromeOptimized("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String processed = s.replaceAll("[\\W_]", "").toLowerCase();
        String processedAndReversed = new StringBuilder(processed).reverse().toString();
        return processed.equals(processedAndReversed);
    }

    public static boolean isPalindromeOptimized(String s) {
        char[] chars = s.toCharArray();

        StringBuilder builder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(chars[i])) {
                builder.append(Character.toLowerCase(chars[i]));
            }
        }
        String processed = builder.toString();

        chars = processed.toCharArray();
        builder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }
        String reversed = builder.toString();

        return processed.equals(reversed);
    }
}
