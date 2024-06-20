package twosum;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

        nums = new int[]{3, 2, 4};
        target = 6;
        result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

        nums = new int[]{12, 7, 3, 5, 6, 11};
        target = 9;
        result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

        nums = new int[]{-1,-2,-3,-4,-5};
        target = -8;
        result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];

        outer:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                    break outer;
                }
            }
        }

        return indexes;
    }
}
