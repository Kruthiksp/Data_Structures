package com.kruthik._2D_Arrays;

public class Creation_And_Initialization {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = i + j;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==============================");
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
