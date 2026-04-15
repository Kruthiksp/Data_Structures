package com.kruthik.dynamicProgramming.knapsack;

import java.util.Arrays;

public class Knapsack {
    public int knapsack(int W, int[] val, int[] wt) {
        int n = val.length;
//        return recursiveApproach(n - 1, W, val, wt);

        int[][] dp = new int[n][W];
        for (int[] row : dp) Arrays.fill(row, -1);
        return memoization(dp, n - 1, W, val, wt);
    }

    private int recursiveApproach(int idx, int W, int[] val, int[] wt) {
        if (idx == 0) {
            if (wt[idx] <= W) return val[idx];
            else return 0;
        }
        int pick = (wt[idx] <= W) ? (val[idx] + recursiveApproach(idx - 1, W - wt[idx], val, wt)) : 0;
        int skip = recursiveApproach(idx - 1, W, val, wt);

        return Math.max(pick, skip);
    }

    private int memoization(int[][] dp, int idx, int W, int[] val, int[] wt) {
        if (idx == 0) {
            if (wt[idx] <= W) return val[idx];
            else return 0;
        }
        if (dp[idx][W] != -1) return dp[idx][W];

        int skip = memoization(dp, idx - 1, W, val, wt);
        int pick = Integer.MIN_VALUE; // indicates not valid
        if (wt[idx] <= W) pick = val[idx] + memoization(dp, idx - 1, W - wt[idx], val, wt);

        dp[idx][W] = Math.max(pick, skip);
        return dp[idx][W];
    }

    private int tabulation(int W, int[] val, int[] wt) {
        int n = val.length;

        int[][] dp = new int[n][W+1];

        // Base case
        for(int w = wt[0]; w<=W; w++) {
            dp[0][w] = val[0];
        }

        // Fill the dp table
        for(int i=1; i<n; i++) {
            for(int w=0; w<=W; w++) {
                int skip = dp[i-1][w];
                int pick = Integer.MIN_VALUE;
                if(wt[i] <= w) {
                    pick = val[i] + dp[i-1][w-wt[i]];
                }
                dp[i][w] = Math.max(pick, skip);
            }
        }
        return dp[n-1][W];
    }
}
