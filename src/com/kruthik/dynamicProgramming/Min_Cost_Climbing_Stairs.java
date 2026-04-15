package com.kruthik.dynamicProgramming;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {

    // Tabulation
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2; i<n; i++) {
            int pick = cost[i] + dp[i-2];
            int skip = cost[i] + dp[i-1];
            dp[i] = Math.min(pick, skip);
        }

        return Math.min(dp[n-1], dp[n-2]);
    }
/*
    // Memoization
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(climb(cost, 0, dp), climb(cost, 1, dp));
    }

    private static int climb(int[] cost, int idx, int[] dp) {
        if (idx >= cost.length) return 0;
        if (dp[idx] != -1) return dp[idx];
        return cost[idx] + Math.min(climb(cost, idx + 1, dp), climb(cost, idx + 2, dp));
    }
 */
}
