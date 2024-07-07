package reversestring;

public class Solution {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(s);
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        for (int leftEnd = 0, rightEnd = s.length - 1; leftEnd < rightEnd; leftEnd++, rightEnd--) {
            s[leftEnd] = (char) (s[leftEnd] ^ s[rightEnd]);
            s[rightEnd] = (char) (s[leftEnd] ^ s[rightEnd]);
            s[leftEnd] = (char) (s[leftEnd] ^ s[rightEnd]);
        }
    }
}
