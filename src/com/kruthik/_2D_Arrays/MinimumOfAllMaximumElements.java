package com.kruthik._2D_Arrays;

// Find the minimum element out of all the maximum elements of each row
public class MinimumOfAllMaximumElements {
    public static void main(String[] args) {
        int[][] arr = {{13, 21, 19}, {44, 35, 36}, {57, 28, 97}};

        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int maximum = Integer.MIN_VALUE;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maximum) {
                    maximum = arr[i][j];
                }
            }
            minimum = Math.min(minimum, maximum);
        }
        System.out.println("Minimum among the maximums is: " + minimum);
    }
}
