package com.kruthik._2D_Arrays;

public class ColumnsWisePrinting {
    public static void main(String[] args) {
        int[][] arr = {{13, 21, 19}, {44, 35, 36}, {57, 28, 97}, {71, 63, 88}};

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
