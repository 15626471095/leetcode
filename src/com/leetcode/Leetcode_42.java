package com.leetcode;

public class Leetcode_42 {

    // 接雨水
    // leetcode 42
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int total = 0;
        for (int i = 0; i < height.length; ) {
            if (height[i] == 0) {
                i++;
                continue;
            }
            int water = 0;
            int j = i + 1;
            int nextPeek = 0;
            for (; j < height.length; j++) {
                if (height[j] > nextPeek) {
                    nextPeek = height[j];
                }
                if (height[j] >= height[i]) {
                    break;
                } else {
                    water += height[i] - height[j];
                }
            }
            if (nextPeek < height[i]) {
                water = 0;
                int k = i + 1;
                for (; k < height.length; k++) {
                    if (height[k] >= nextPeek) {
                        break;
                    }
                    water += nextPeek - height[k];
                }
                i = k;
            } else {
                if (j == height.length) {
                    water = 0;
                    i++;
                } else {
                    i = j;
                }
            }
            total += water;
        }
        return total;
    }

}
