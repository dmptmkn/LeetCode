package studentattendancerecordi;

public class Solution {

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
        System.out.println(checkRecord("LALL"));
    }

    public static boolean checkRecord(String s) {
        int absentCounter = 0;
        int lateCounter = 0;

        char[] record = s.toCharArray();
        for (char c : record) {
            if (c == 'A') {
                absentCounter++;
                lateCounter = 0;
            } else if (c == 'L') {
                lateCounter++;
            } else if (c == 'P') {
                lateCounter = 0;
            }

            if (absentCounter > 1 || lateCounter == 3) return false;
        }

        return true;
    }
}
