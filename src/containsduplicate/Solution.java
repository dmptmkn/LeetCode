package containsduplicate;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numNTimes = new HashMap<>();
        for (int num : nums) numNTimes.merge(num, 1, Integer::sum);
        for (int nTimes : numNTimes.values()) if (nTimes > 1) return true;
        return false;
    }
}
