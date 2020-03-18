package com.leetcode;

public class Leetcode_5099 {

    // leetcode 5099 验证回文字符串 III
    public boolean isValidPalindrome(String s, int k) {
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < len - i; j++) {
                int j1 = j + i;
                if (s.charAt(j) == s.charAt(j1)) {
                    dp[j][j1] = dp[j + 1][j1 - 1];
                } else {
                    dp[j][j1] = Math.min(dp[j + 1][j1] + 1, dp[j][j1 - 1] + 1);
                }
            }
        }
        return dp[0][len - 1] <= k;
    }


}
