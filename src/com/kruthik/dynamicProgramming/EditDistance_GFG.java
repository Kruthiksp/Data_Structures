package com.kruthik.dynamicProgramming;

import java.util.Arrays;

public class EditDistance_GFG {
    public int editDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n][m];
        for (int[] row : dp) Arrays.fill(row, -1);

        return helper(dp, n - 1, m - 1, new StringBuilder(s1), new StringBuilder(s2));
    }

    private static int helper(int[][] dp, int i, int j, StringBuilder s1, StringBuilder s2) {

        if (i < 0) return j + 1;
        if (j < 0) return i + 1;

        if (dp[i][j] != -1) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) return dp[i][j] = helper(dp, i - 1, j - 1, s1, s2);
        else {
            int replace = 1 + helper(dp, i - 1, j - 1, s1, s2);
            int delete = 1 + helper(dp, i - 1, j, s1, s2);
            int insert = 1 + helper(dp, i, j - 1, s1, s2);
            return dp[i][j] = Math.min(delete, Math.min(replace, insert));
        }
    }
}
