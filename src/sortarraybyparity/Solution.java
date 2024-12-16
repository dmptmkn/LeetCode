package sortarraybyparity;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0})));
        System.out.println(Arrays.toString(sortArrayByParityStream(new int[]{3, 1, 2, 4})));
    }

    public static int[] sortArrayByParity(int[] nums) {
        if (nums.length < 2) return nums;

        int write = 0;
        int read = 0;
        int temp;
        while (read < nums.length) {
            if (nums[read] % 2 == 0) {
                temp = nums[write];
                nums[write] = nums[read];
                nums[read] = temp;
                write++;
            }
            read++;
        }

        return nums;
    }

    public static int[] sortArrayByParityStream(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.comparingInt(o -> o % 2))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
