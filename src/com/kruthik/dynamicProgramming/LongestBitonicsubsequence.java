package com.kruthik.dynamicProgramming;

import java.util.Arrays;

public class LongestBitonicsubsequence {
    public static int longestBitonicSequence(int n, int[] arr) {
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, 1);
        Arrays.fill(dp2, 1);

        // left to right
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i])
                    max = Math.max(max, dp1[j]);
            }
            dp1[i] = 1 + max;
        }

        // right to left
        for (int i = n - 2; i >= 0; i--) {
            int max = 0;
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i])
                    max = Math.max(max, dp2[j]);
            }
            dp2[i] = 1 + max;
        }

        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            if (dp1[i] != 1 && dp2[i] != 1)
                maxLen = Math.max(maxLen, dp1[i] + dp2[i] - 1);
        }
        return maxLen;
    }
}
