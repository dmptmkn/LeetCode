package keyboardrow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static final String FIRST_ROW = "qwertyuiopQWERTYUIOOP";
    public static final String SECOND_ROW = "asdfghjklASDFGHJKL";
    public static final String THIRD_ROW = "zxcvbnmZXCVBNM";

    public static void main(String[] args) {
        String[] words = findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        System.out.println(Arrays.toString(words));
    }

    public static String[] findWords(String[] words) {
        List<String> oneRowWords = new ArrayList<>();
        for (String word : words)
            if (isOneRowWord(word)) oneRowWords.add(word);

        String[] result = new String[oneRowWords.size()];
        return oneRowWords.toArray(result);
    }

    public static boolean isOneRowWord(String word) {
        char[] chars = word.toCharArray();

        String rowToCheck;
        if (FIRST_ROW.indexOf(chars[0]) != -1) rowToCheck = FIRST_ROW;
        else if (SECOND_ROW.indexOf(chars[0]) != -1) rowToCheck = SECOND_ROW;
        else rowToCheck = THIRD_ROW;

        for (char c : chars)
            if (rowToCheck.indexOf(c) == -1) return false;

        return true;
    }
}
