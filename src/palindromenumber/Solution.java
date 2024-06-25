package palindromenumber;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindromeOptimized(1441));
        System.out.println(isPalindromeOptimized(1553551));
        System.out.println(isPalindromeOptimized(123412));
    }

    public static boolean isPalindrome(int x) {
        String unreversed = String.valueOf(x);
        String reversed = new StringBuilder(unreversed).reverse().toString();

        return unreversed.equals(reversed);
    }

    public static boolean isPalindromeOptimized(int x) {
        int reversed = 0;
        int remainder = 0;
        int temporaryX = x;

        while (temporaryX > 0) {
            remainder = temporaryX % 10;
            reversed = (reversed * 10) + remainder;
            temporaryX = temporaryX / 10;
        }

        return x == reversed;
    }
}
