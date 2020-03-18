package com.leetcode;

public class Leetcode_1060 {

    // leetcode 1060 有序数组中的缺失元素
    public int missingElement(int[] nums, int k) {
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int next = nums[i];
            int gap = next - cur - 1;
            if (gap == 0) {
                cur = next;
                continue;
            }
            if (gap >= k) {
                return cur + k;
            }
            k -= gap;
            cur = next;
        }
        return cur + k;
    }

}
