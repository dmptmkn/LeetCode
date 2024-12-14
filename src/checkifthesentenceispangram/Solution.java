package checkifthesentenceispangram;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(checkIfPangramSet("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangramSet("leetcode"));
        System.out.println(checkIfPangramStream("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangramStream("leetcode"));
    }

    public static boolean checkIfPangramSet(String sentence) {
        if (sentence.length() < 26) return false;

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : sentence.toCharArray()) uniqueChars.add(c);

        return uniqueChars.size() == 26;
    }

    public static boolean checkIfPangramStream(String sentence) {
        if (sentence.length() < 26) return false;

        long uniqueCharsCount = sentence.chars()
                .filter(Character::isAlphabetic)
                .map(Character::toLowerCase)
                .distinct()
                .count();

        return uniqueCharsCount == 26;
    }
}
