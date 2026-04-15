package com.kruthik.dynamicProgramming.knapsack;

import java.util.Arrays;

public class CoinChange_CountWays_GFG {
    public int count(int[] coins, int sum) {
        int n = coins.length;

        int[][] dp = new int[n][sum + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return helper(dp, 0, coins, sum);
    }

    private int helper(int[][] dp, int idx, int[] coins, int sum) {
        if (sum == 0) return 1;
        if (idx == coins.length || sum < 0) return 0;

        if (dp[idx][sum] != -1) return dp[idx][sum];

        int skip = helper(dp, idx + 1, coins, sum);
        int pick = helper(dp, idx, coins, sum - coins[idx]);

        return dp[idx][sum] = skip + pick;
    }
}
