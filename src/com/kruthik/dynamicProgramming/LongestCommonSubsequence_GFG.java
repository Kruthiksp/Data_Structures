package com.kruthik.dynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence_GFG {
    public static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n][m];
        for (int[] row : dp)
            Arrays.fill(row, -1);

//        return momoization(dp, n - 1, m - 1, new StringBuilder(s1), new StringBuilder(s2));
        return tabulation(s1, s2);
    }

    private static int momoization(int[][] dp, int i, int j, StringBuilder s1, StringBuilder s2) {

        if (i < 0 || j < 0) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + momoization(dp, i - 1, j - 1, s1, s2);
            return dp[i][j];
        } else {
            int a = momoization(dp, i - 1, j, s1, s2);
            int b = momoization(dp, i, j - 1, s1, s2);
            dp[i][j] = Math.max(a, b);
            return dp[i][j];
        }
    }

    private static int tabulation(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i) == s2.charAt(j)) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[n][m];
    }
}
