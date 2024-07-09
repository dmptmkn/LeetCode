package majorityelement;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numNTimes = new HashMap<>();

        for (int n : nums) numNTimes.merge(n, 1, Integer::sum);
        Integer maxValue = numNTimes.values().stream().max(Comparator.naturalOrder()).get();

        return numNTimes.entrySet().stream()
                .filter(e -> e.getValue() == maxValue)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}
