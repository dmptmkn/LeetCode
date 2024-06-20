package palindromenumber;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        String unreversed = String.valueOf(x);
        String reversed = new StringBuilder(unreversed).reverse().toString();

        return unreversed.equals(reversed);
    }
}
