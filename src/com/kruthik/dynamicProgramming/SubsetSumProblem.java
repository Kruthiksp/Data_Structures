package com.kruthik.dynamicProgramming;

public class SubsetSumProblem {

    public static Boolean isSubsetSum(int[] arr, int sum) {
        int n = arr.length;
        Boolean[][] dp = new Boolean[n][sum + 1];
        return helper(dp, 0, arr, sum);
    }

    private static boolean helper(Boolean[][] dp, int idx, int[] arr, int sum) {

        if (sum == 0) return true;
        if (idx == arr.length /*|| sum < 0*/) return false;

        if (dp[idx][sum] != null) return dp[idx][sum];

        Boolean skip = helper(dp, idx + 1, arr, sum);
        Boolean pick = false;
        if (arr[idx] <= sum) pick = helper(dp, idx + 1, arr, sum - arr[idx]);

        return dp[idx][sum] = (pick || skip);
    }
}
