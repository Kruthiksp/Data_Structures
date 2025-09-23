package com.kruthik._2D_Arrays;

public class RowWithMaximumSum {
    public static void main(String[] args) {
        int[][] arr = {{13, 21, 19}, {44, 35, 36}, {57, 28, 97}};
        int maxRow = -1;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if(sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println(maxRow + " row has the maximum sum among the array\nwith total sum: " + maxSum);
    }
}
