package com.kruthik.dynamicProgramming;

public class FIbonacci {

    public int nthFibonacci(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
        int[] dp = new int[3];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++) {
            dp[2] = dp[1] + dp[0];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }
/*
    public int nthFibonacci(int n) {
        int[] arr = new int[n + 1];   // idx from 0 to n
        return fibonacci(n, arr);
    }

    private int fibonacci(int n, int[] arr) {
        if (n == 0 || n == 1) return n;
        if (arr[n] != 0) return arr[n];

        int val = fibonacci(n - 1, arr) + fibonacci(n - 2, arr);
        arr[n] = val;

        return val;
    }
 */
}
