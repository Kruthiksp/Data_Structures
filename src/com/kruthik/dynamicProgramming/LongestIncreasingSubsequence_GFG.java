package com.kruthik.dynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence_GFG {
    public static int lis(int[] arr) {
        return recursive(0, -1, arr);
    }

    private static int recursive(int idx, int prevIdx, int[] arr) {
        if (idx == arr.length) return 0;

        int skip = recursive(idx + 1, prevIdx, arr);
        if (prevIdx != -1 && arr[idx] <= arr[prevIdx]) return skip;
        int pick = 1 + recursive(idx + 1, idx, arr);

        return Math.max(pick, skip);
    }

    // idx -> 0 to n-1
    // prevIdx -> -1 to n-1 (ie, 0 to n)
    private static int memoization(int[][] dp, int idx, int prevIdx, int[] arr) {
        if (idx == arr.length) return 0;
        if (dp[idx][prevIdx + 1] != -1) return dp[idx][prevIdx + 1];

        int skip = memoization(dp, idx + 1, prevIdx, arr);
        if (prevIdx != -1 && arr[idx] <= arr[prevIdx])
            return dp[idx][prevIdx + 1] = skip;
        int pick = 1 + memoization(dp, idx + 1, idx, arr);

        return dp[idx][prevIdx + 1] = Math.max(pick, skip);
    }

    private static int tabulation(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxLen = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) max = Math.max(dp[j], max);
            }
            dp[i] += max;
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }
}
