package com.kruthik.dynamicProgramming;

public class CountSquareSubmatricesWithAllOnes {

    public int countSquares(int n, int m, int mat[][]) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] != 0) {
                    count++;
                    if (i != 0 && j != 0) {
                        int min = Math.min(
                                mat[i - 1][j - 1],
                                Math.min(mat[i - 1][j], mat[i][j - 1])
                        );
                        mat[i][j] += min;
                        count += min;
                    }
                }

            }
        }

        return count;
    }

}
