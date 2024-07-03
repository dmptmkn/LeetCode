package validpalindrome;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("A_ha"));
        System.out.println(isPalindromeOptimized("A man, a plan, a canal: Panama"));
        System.out.println(isPalindromeStack("A man, a plan, a canal: Panama"));
        System.out.println(isPalindromeXOR("A man, a plan, a canal: Panama"));
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

    public static boolean isPalindromeStack(String s) {
        char[] chars = s.toCharArray();

        StringBuilder builder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(chars[i])) {
                builder.append(Character.toLowerCase(chars[i]));
            }
        }
        String processed = builder.toString();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < processed.length(); i++) {
            stack.push(processed.charAt(i));
        }

        builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        String processedAndReversed = builder.toString();

        return processed.equals(processedAndReversed);
    }

    public static boolean isPalindromeXOR(String s) {
        char[] chars = s.toCharArray();

        StringBuilder builder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(chars[i])) {
                builder.append(Character.toLowerCase(chars[i]));
            }
        }
        String processed = builder.toString();

        int low = 0;
        int high = chars.length - 1;

        builder = new StringBuilder();
        while (low < high) {
            chars[low] = (char) (chars[low] ^ chars[high]);
            chars[high] = (char) (chars[low] ^ chars[high]);
            chars[low] = (char) (chars[low] ^ chars[high]);
            low++;
            high--;
        }

        for (int i = 0; i < chars.length; i++) {
            builder.append(chars[i]);
        }
        String processedAndReversed = builder.toString();

        return processed.equals(processedAndReversed);
    }
}
