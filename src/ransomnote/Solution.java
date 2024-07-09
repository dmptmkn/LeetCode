package ransomnote;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(canConstruct("aaa", "aaISn"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        List<Character> magazineChars = new ArrayList<>();
        for (char c : magazine.toCharArray())
            magazineChars.add(c);

        char[] noteChars = ransomNote.toCharArray();
        for (char c : noteChars) {
            int index = magazineChars.indexOf(c);

            if (index == -1) return false;
            else magazineChars.remove(index);
        }

        return true;
    }
}
