package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_128 {

    // 最长连续序列
    // leetcode 128
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.compute(nums[i], (k, v) -> {
                if (v == null) {
                    v = 1;
                }
                return v;
            });
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (!map.containsKey(v)) {
                continue;
            }
            int len = 1;
            Integer last, next;
            v = nums[i];
            while ((last = map.get(--v)) != null) {
                len += last;
                map.remove(v);
            }
            v = nums[i];
            while ((next = map.get(++v)) != null) {
                len += next;
                map.remove(v);
            }
            if (len > max) {
                max = len;
            }
        }
        return max;
    }


}
