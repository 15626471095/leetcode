package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_1 {

    //两数之和
    // leetcode 1
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (map.containsKey(target - v)) {
                return new int[]{map.get(target - v), i};
            }
            map.put(v, i);
        }
        return new int[]{};
    }

}
