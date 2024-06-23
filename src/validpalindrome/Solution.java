package validpalindrome;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("A_ha"));
    }

    public static boolean isPalindrome(String s) {
        String processed = s.replaceAll("[\\W_]", "").toLowerCase();
        String processedAndReversed = new StringBuilder(processed).reverse().toString();
        return processed.equals(processedAndReversed);
    }
}
