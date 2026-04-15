package com.kruthik.dynamicProgramming;

import java.util.Arrays;

public class ShortestCommonSupersequence {
    public static int minSuperSeq(String s1, String s2) {
        return s1.length() + s2.length() - lcs(s1, s2);
    }

    private static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n][m];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return helper(dp, n - 1, m - 1, new StringBuilder(s1), new StringBuilder(s2));
    }

    // Memoization
    private static int helper(int[][] dp, int i, int j, StringBuilder s1, StringBuilder s2) {

        if (i < 0 || j < 0) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + helper(dp, i - 1, j - 1, s1, s2);
            return dp[i][j];
        } else {
            int a = helper(dp, i - 1, j, s1, s2);
            int b = helper(dp, i, j - 1, s1, s2);
            dp[i][j] = Math.max(a, b);
            return dp[i][j];
        }
    }
}
