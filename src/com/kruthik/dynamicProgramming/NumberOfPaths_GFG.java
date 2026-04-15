package com.kruthik.dynamicProgramming;

public class NumberOfPaths_GFG {

    // Space Optimized
    public int numberOfPaths(int n, int m) {
        int[][] mat = new int[2][m];

        for (int j = 0; j < m; j++) {
            mat[0][j] = 1;
        }
        mat[1][0] = 1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < m; j++) {
                mat[1][j] = mat[0][j] + mat[1][j-1];

                mat[0][j] = mat[1][j];
            }
        }
        return mat[n - 1][m - 1];
    }

/*
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
 */
}
