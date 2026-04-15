package com.kruthik.dynamicProgramming;

public class Stickler_Thief_GFG {

    // Space Optimized
    public int findMaxSum(int arr[]) {
        int n = arr.length;

        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0], arr[1]);

        int[] dp = new int[3];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i=2; i<n; i++) {
            int pick = arr[i] + dp[0];
            int skip = dp[1];
            dp[2] = Math.max(pick, skip);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }

/*
    // Tabulation
    public int findMaxSum(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            int pick = arr[i] + dp[i - 2];
            int skip = dp[i - 1];
            dp[i] = Math.max(pick, skip);
        }
        return dp[n - 1];
    }
*/
/*
    // Memoization
    public int findMaxSum(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return loot(0, arr, dp);
    }

    private static int loot(int idx, int[] arr, int[] dp) {
        if (idx >= arr.length) return 0;
        if (dp[idx] != -1) return dp[idx];

        int pick = arr[idx] + loot(idx + 2, arr, dp);
        int skip = loot(idx + 1, arr, dp);

        int ans = Math.max(pick, skip);
        dp[idx] = ans;

        return ans;
    }
 */
}
