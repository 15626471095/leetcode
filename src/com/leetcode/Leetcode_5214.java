package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_5214 {

    // leetcode 5214 最长定差子序列
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int len = map.getOrDefault(arr[i] - difference, 0) + 1;
            map.put(arr[i], len);
            max = Math.max(max, len);
        }
        return max;
    }

}
