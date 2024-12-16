package movezeroes;

public class Solution {

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length < 2) return;

        for (int read = 0, write = 0, temp; read < nums.length; read++) {
            if (nums[read] != 0) {
                temp = nums[write];
                nums[write] = nums[read];
                nums[read] = temp;
                write++;
            }
        }
    }
}
