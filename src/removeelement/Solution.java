package removeelement;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{4, 3, 4, 5, 6, 7}, 4));
    }

    public static int removeElement(int[] nums, int val) {
        int notValCounter = 0;

        for (int read = 0, write = 0; read < nums.length; read++) {
            if (nums[read] != val) {
                nums[write] = nums[read];
                write++;
                notValCounter++;
            }
        }

        return notValCounter;
    }
}
