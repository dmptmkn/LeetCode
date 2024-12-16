package removeduplicatesfromsortedarray;

public class Solution {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }

    public static int removeDuplicates(int[] nums) {
        int write = 0;
        int read = 1;

        while (read < nums.length) {
            if (nums[write] != nums[read]) {
                nums[write + 1] = nums[read];
                write++;
            }
            read++;
        }

        return write + 1;
    }
}
