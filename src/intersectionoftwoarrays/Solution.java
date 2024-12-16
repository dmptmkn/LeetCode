package intersectionoftwoarrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

        int[] nums3 = {4, 7, 9, 7, 6, 7};
        int[] nums4 = {5, 0, 0, 6, 1, 6, 2, 2, 4};
        System.out.println(Arrays.toString(intersection(nums3, nums4)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums = new HashSet<>();
        for (int n : nums1) {
            nums.add(n);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int n : nums2) {
            if (nums.contains(n)) {
                intersection.add(n);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (int n : intersection) {
            result[i++] = n;
        }

        return result;
    }
}
