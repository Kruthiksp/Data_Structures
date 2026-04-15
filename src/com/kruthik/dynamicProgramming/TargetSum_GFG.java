package com.kruthik.dynamicProgramming;

public class TargetSum_GFG {
    public int totalWays(int[] arr, int target) {
        int absSum = 0;

        for (int ele : arr) absSum += Math.abs(ele);

        int[][] dp = new int[arr.length][1 + 2 * absSum];

        return helper(0, 0, dp, absSum, arr, target);
    }

    private int helper(int idx, int sum, int[][] dp, int absSum, int[] arr, int target) {
        if (idx == arr.length) {
            if (sum == target) return 1;
            else return 0;
        }

        if (dp[idx][sum + absSum] != 0) return dp[idx][sum + absSum];

        int add = helper(idx + 1, sum + arr[idx], dp, absSum, arr, target);
        int sub = helper(idx + 1, sum - arr[idx], dp, absSum, arr, target);

        return dp[idx][sum + absSum] = add + sub;
    }
}
