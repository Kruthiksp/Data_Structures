package com.kruthik._2D_Arrays;

import java.util.HashSet;

public class SetMatrixZeros_GFG {
    public void setMatrixZeroes(int[][] mat) {
//        regularApproach(mat);
        optimizedApproach(mat);
    }

    private static void optimizedApproach(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Check first row
        for (int j = 0; j < m; j++) {
            if (mat[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }
        // Step 2: Check first column
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        // Step 3: Use first row & column as markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }
        // Step 4: Fill based on markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[0][j] == 0 || mat[i][0] == 0) mat[i][j] = 0;
            }
        }
        // Step 5: Handle first row
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                mat[0][j] = 0;
            }
        }
        // Step 6: Handle first column
        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                mat[i][0] = 0;
            }
        }
    }

    private static void regularApproach(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rows.contains(i) || cols.contains(j)) mat[i][j] = 0;
            }
        }
    }
}
