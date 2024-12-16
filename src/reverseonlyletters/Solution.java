package reverseonlyletters;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String s) {
        if (s.length() < 2) return s;

        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;
        char temp;
        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            while (right > left && !Character.isLetter(chars[right])) {
                right--;
            }
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
