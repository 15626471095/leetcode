package com.leetcode;

public class Leetcode_1063 {

    // leetcode 1063 有效子数组数目
    public int validSubarrays(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] >= nums[i]) {
                    result++;
                } else {
                    break;
                }
            }
        }
        return result;
    }

}
