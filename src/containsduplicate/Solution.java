package containsduplicate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(containsDuplicateSet(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicateSet(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicateMap(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println(containsDuplicateBruteForce(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicateBruteForce(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicateBruteForce(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println(containsDuplicateStream(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicateStream(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicateStream(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

    }

    public static boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateSet(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int num : nums) if (!integers.add(num)) return true;
        return false;
    }

    public static boolean containsDuplicateMap(int[] nums) {
        Map<Integer, Integer> numNTimes = new HashMap<>();
        for (int num : nums) numNTimes.merge(num, 1, Integer::sum);
        for (int nTimes : numNTimes.values()) if (nTimes > 1) return true;
        return false;
    }

    public static boolean containsDuplicateStream(int[] nums) {
        return nums.length != Arrays.stream(nums)
                .distinct()
                .count();
    }
}
