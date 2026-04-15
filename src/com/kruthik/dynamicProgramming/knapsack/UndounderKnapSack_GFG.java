package com.kruthik.dynamicProgramming;

public class UndounderKnapSack_GFG {

    public int knapSack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        int[][] dp = new int[n][capacity + 1];
        return helper(dp, 0, val, wt, capacity);
    }

    private int helper(int[][] dp, int idx, int[] val, int[] wt, int capacity) {

        if (idx == val.length) {
            return 0;
        }
        if (dp[idx][capacity] != 0) return dp[idx][capacity];

        int skip = helper(dp, idx + 1, val, wt, capacity);
        int pick = Integer.MIN_VALUE;
        if (capacity < wt[idx]) {
            return dp[idx][capacity] = skip;
        }
        pick = val[idx] + helper(dp, idx, val, wt, capacity - wt[idx]);
        return dp[idx][capacity] = Math.max(skip, pick);
    }
}
