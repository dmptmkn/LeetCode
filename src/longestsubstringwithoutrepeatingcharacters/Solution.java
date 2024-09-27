package longestsubstringwithoutrepeatingcharacters;

public class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("aab"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;

        for (int i = 0; i < n; i++) {

            boolean[] visited = new boolean[256];

            for (int j = i; j < n; j++) {
                if (visited[s.charAt(j)]) {
                    break;
                }
                else {
                    res = Math.max(res, j - i + 1);
                    visited[s.charAt(j)] = true;
                }
            }
        }
        return res;
    }
}
