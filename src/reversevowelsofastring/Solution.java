package reversevowelsofastring;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        if (s.length() < 2) return s;

        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();

        int leftPointer = 0;
        int rightPointer = chars.length - 1;
        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer && vowels.indexOf(chars[leftPointer]) == -1)
                leftPointer++;
            while (rightPointer > leftPointer && vowels.indexOf(chars[rightPointer]) == -1)
                rightPointer--;
            char temp = chars[leftPointer];
            chars[leftPointer] = chars[rightPointer];
            chars[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }

        return new String(chars);
    }
}
