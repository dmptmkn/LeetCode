package majorityelement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElementOptimized(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityElementOptimized(new int[]{3,2,3}));

    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numNTimes = new HashMap<>();
        for (int n : nums) numNTimes.merge(n, 1, Integer::sum);

        Integer maxValue = numNTimes.values()
                .stream()
                .max(Comparator.naturalOrder())
                .orElseThrow();

        return numNTimes.entrySet().stream()
                .filter(e -> e.getValue() == maxValue)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow();
    }

    public static int majorityElementOptimized(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElseThrow();
    }
}
