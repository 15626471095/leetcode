package com.leetcode;

public class Leetcode_10 {

    // 正则表达式匹配
    // leetcode 10
    public boolean isRegexMatchDynamic(String s, String p) {
        s = new StringBuilder(s).reverse().toString();
        p = new StringBuilder(p).reverse().toString();
        int m = s.length();
        int n = p.length();
        boolean dp[][] = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int i = 1; i <= n; i += 2) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i + 1] = true;
                continue;
            }
            break;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    continue;
                }
                if (j >= 2 && p.charAt(j - 2) == '*') {
                    dp[i][j] = (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.') ? dp[i - 1][j] || dp[i][j - 2] : dp[i][j - 2];
                } else {
                    dp[i][j] = dp[i - 1][j - 1] && (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1));
                }
            }
        }

        return dp[m][n];
    }

}
