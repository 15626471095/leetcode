package com.leetcode;

public class Leetcode_4 {

    // leetcode 4
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if (len == 0) {
            return 0d;
        }
        if (len % 2 == 0) {
            return (findN(nums1, nums2, len / 2) + findN(nums1, nums2, len / 2 + 1)) / 2.0;
        } else {
            return findN(nums1, nums2, len / 2 + 1);
        }
    }

    public int findN(int[] nums1, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        while (n > 1) {
            int mid = n / 2;
            if (p1 >= nums1.length) {
                return nums2[p2 + n - 1];
            }
            if (p2 >= nums2.length) {
                return nums1[p1 + n - 1];
            }
            if (p1 + mid > nums1.length) {
                mid = nums1.length - p1;
            }
            if (p2 + mid > nums2.length) {
                mid = nums2.length - p2;
            }
            if (nums1[p1 + mid - 1] <= nums2[p2 + mid - 1]) {
                p1 += mid;
            } else {
                p2 += mid;
            }
            n -= mid;
        }
        if (p1 == nums1.length) {
            return nums2[p2];
        } else if (p2 == nums2.length) {
            return nums1[p1];
        }
        return Math.min(nums1[p1], nums2[p2]);
    }

}
