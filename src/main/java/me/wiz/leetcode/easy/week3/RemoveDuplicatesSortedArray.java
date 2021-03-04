package me.wiz.leetcode.easy.week3;

import java.util.Arrays;


public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesSortedArray removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
        int[] nums = new int[]{1,1,2};
        int answer = removeDuplicatesSortedArray.removeDuplicates(nums);

        System.out.println(answer);
    }

    public int removeDuplicatesLambda(int[] nums) {
        return Arrays.stream(nums).distinct().toArray().length;
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
