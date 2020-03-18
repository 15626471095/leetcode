package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_5212 {

    // leetcode 5212 玩筹码
    public int minCostToMoveChips(int[] chips) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : chips) {
            map.compute(i, (k, v) -> {
                if (v == null) {
                    v = 0;
                }
                v++;
                return v;
            });
        }
        int count1 = 0, count2 = 0;
        for (int k : map.keySet()) {
            if (k % 2 == 0) {
                count1 += map.get(k);
            } else {
                count2 += map.get(k);
            }
        }
        return Math.min(count1, count2);
    }

}
