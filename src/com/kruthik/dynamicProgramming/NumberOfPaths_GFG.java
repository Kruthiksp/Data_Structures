package com.kruthik.dynamicProgramming;

public class NumberOfPaths {
    public int numberOfPaths(int n, int m) {
        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0) mat[i][j] = 1;
                else mat[i][j] = mat[i - 1][j] + mat[i][j - 1];
            }
        }
        return mat[n - 1][m - 1];
    }
}
