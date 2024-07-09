package numberofsegmentsinasting;

public class Solution {

    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
    }

    public static int countSegments(String s) {
        if (s.trim().isEmpty()) return 0;
        return s.trim().split("\\s+").length;
    }

}
