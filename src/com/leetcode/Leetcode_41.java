package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_41 {

    // leetcode 41 缺失的第一个正数
    public int firstMissingPositive(int[] nums) {
        List<Long> flags = new ArrayList<>();
        while (flags.size() < (nums.length - 1) / 64 + 1) {
            flags.add(0L);
        }
        for (int n : nums) {
            if (n > nums.length || n <= 0) {
                continue;
            }
            int index = (n - 1) / 64;
            n = (n - 1) % 64 + 1;
            flags.set(index, flags.get(index) | (1L << (n - 1)));
        }
        for (int i = 1; i <= nums.length; i++) {
            int index = (i - 1) / 64;
            if (((1L << (i - 1)) & flags.get(index)) == 0) {
                return i;
            }
        }
        return nums.length + 1;
    }

}
