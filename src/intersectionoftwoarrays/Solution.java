package intersectionoftwoarrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersectionSet(nums1, nums2)));
        System.out.println(Arrays.toString(intersectionTwoPointers(nums1, nums2)));

        int[] nums3 = {4, 7, 9, 7, 6, 7};
        int[] nums4 = {5, 0, 0, 6, 1, 6, 2, 2, 4};
        System.out.println(Arrays.toString(intersectionSet(nums3, nums4)));
        System.out.println(Arrays.toString(intersectionTwoPointers(nums3, nums4)));
    }

    public static int[] intersectionSet(int[] nums1, int[] nums2) {
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

    public static int[] intersectionTwoPointers(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> intersection = new HashSet<>();
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < nums1.length && pointer2 < nums2.length) {
            if (nums1[pointer1] == nums2[pointer2]) {
                intersection.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            } else if (nums1[pointer1] < nums2[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
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
