package com.kruthik.dynamicProgramming;

public class FriendsPairingProblem_GFG {

    // Space Optimized - Tabulation
    public long countFriendsPairings(int n) {
        if (n <= 2) return n;

        long[] dp = new long[3];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 3; i <= n; i++) {
            dp[2] = countFriendsPairings(i) + (n - 1) * countFriendsPairings(n - 2);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }

        return dp[2];
    }

    private long friends(int n, long[] dp) {
        if (n <= 2) return n;
        if (dp[n] != 0) return dp[n];

        return friends(n - 1, dp) + (n - 1) * friends(n - 2, dp);
    }

/*
    // Tabulation
    public long countFriendsPairings(int n) {
        long[] dp = new long[n + 1];
        return friends(n, dp);
    }

    private long friends(int n, long[] dp) {
        if (n <= 2) return n;
        if (dp[n] != 0) return dp[n];

        return friends(n - 1, dp) + (n - 1) * friends(n - 2, dp);
    }
*/
/*
    // Formula : f(n) = f(n-1) + (n-1) * f(n-2)
    public long countFriendsPairings(int n) {
        if(n<=2) return n;
        return countFriendsPairings(n-1) + (n-1) * countFriendsPairings(n-2);
    }
*/
}
