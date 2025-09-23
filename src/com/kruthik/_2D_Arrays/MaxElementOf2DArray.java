package com.kruthik._2D_Arrays;

public class MaxElementOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {{13, 21, 3}, {44, 35, 36}, {57, 28, 19}};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum Element in this 2D array is: " + max);
    }
}
