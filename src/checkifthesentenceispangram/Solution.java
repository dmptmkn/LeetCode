package checkifthesentenceispangram;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(checkIfPangramSet("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangramSet("leetcode"));
    }

    public static boolean checkIfPangramSet(String sentence) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : sentence.toCharArray()) uniqueChars.add(c);
        return uniqueChars.size() == 26;
    }

}
