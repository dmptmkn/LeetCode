package robotreturntoorigin;

public class Solution {

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
        System.out.println(judgeCircle("ULDRLLRR"));
    }

    public static boolean judgeCircle(String moves) {
        int xAxis = 0;
        int yAxis = 0;

        for (char move : moves.toCharArray()) {
            if (move == 'R') xAxis += 1;
            else if (move == 'L') xAxis -= 1;
            else if (move == 'U') yAxis += 1;
            else if (move == 'D') yAxis -= 1;
        }

        return xAxis == 0 && yAxis == 0;
    }
}
