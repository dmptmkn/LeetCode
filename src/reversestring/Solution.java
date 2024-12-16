package reversestring;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s);
        s = new char[] {'h', 'e', 'l', 'l', 'o'};
        reverseStringStack(s);
        System.out.println(s);

    }

    public static void reverseString(char[] s) {
        for (int leftEnd = 0, rightEnd = s.length - 1; leftEnd < rightEnd; leftEnd++, rightEnd--) {
            s[leftEnd] = (char) (s[leftEnd] ^ s[rightEnd]);
            s[rightEnd] = (char) (s[leftEnd] ^ s[rightEnd]);
            s[leftEnd] = (char) (s[leftEnd] ^ s[rightEnd]);
        }
    }

    public static void reverseStringStack(char[] s) {
        Stack<Character> chars = new Stack<>();
        for (char c : s) chars.add(c);
        for (int i = 0; i < s.length; i++) s[i] = chars.pop();
    }
}
