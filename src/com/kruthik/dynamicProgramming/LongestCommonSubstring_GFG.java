package com.kruthik.dynamicProgramming;

public class LongestCommonSubstring_GFG {
    public int longCommSubstr(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = 1;
                    if (i != 0 && j != 0) {
                        dp[i][j] += dp[i - 1][j - 1];
                    }
                }
            }
        }
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxLen = Math.max(dp[i][j], maxLen);
            }
        }
        return maxLen;
    }
}
