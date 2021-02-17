package me.wiz.leetcode.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        String print = Arrays.stream(twoSum(nums, target)).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(print);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}
