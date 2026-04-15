package com.kruthik.dynamicProgramming.knapsack;

import java.util.Arrays;

public class CoinChange_MinimumCoins_GFG {
    public int minCoins(int[] coins, int sum) {
        int n = coins.length;

        int[][] dp = new int[n][sum + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        int ans = helper(dp, 0, coins, sum);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int helper(int[][] dp, int idx, int[] coins, int sum) {

        if (sum == 0) return 0;
        if (idx == coins.length) // we cant pick
            return Integer.MAX_VALUE;

        if (dp[idx][sum] != -1) return dp[idx][sum];

        // Skip
        int skip = helper(dp, idx + 1, coins, sum);
        // Pick
        int pick = Integer.MAX_VALUE;
        if (coins[idx] <= sum) {
            int res = helper(dp, idx, coins, sum - coins[idx]);
            if (res != Integer.MAX_VALUE) pick = 1 + res;
        }

        return dp[idx][sum] = Math.min(pick, skip);
    }
}
