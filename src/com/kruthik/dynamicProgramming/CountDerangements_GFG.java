package com.kruthik.dynamicProgramming;

import java.util.Arrays;

public class CountDerangements_GFG {
    static int countDer(int n) {
        // Recursive Approach
        // return recursive(n);

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        // Memoization
        // return memoization(n, dp);

        // Tabulation
        return tabulation(n, dp);
    }

    // Recursive
    private static int recursive(int n) {
        if (n <= 3) return n - 1;
        return (n - 1) * (countDer(n - 1) + countDer(n - 2));
        /*
            - Here n-2 is a case where 2 numbers got swapped, and
            - n-1 is a case where a number changed its position but the
                |-> other did not aquire its position
        */
    }

    // Memoization
    private static int memoization(int n, int[] dp) {
        if (n <= 2) return n - 1;
        if (dp[n] != -1) return dp[n];

        int ans = (n - 1) * (memoization(n - 1, dp) + memoization(n - 2, dp));
        dp[n] = ans;
        return ans;
    }

    // Tabulation
    private static int tabulation(int n, int[] dp) {
        if (n <= 2) return n - 1;

        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]);
        }
        return dp[n];
    }
}
