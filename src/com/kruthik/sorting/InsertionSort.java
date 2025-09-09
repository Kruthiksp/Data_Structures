package com.kruthik.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, -15, 30, -25};
        int n = arr.length;

        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < n; i++) {
            int j=i;
            while(j>0 && arr[j] < arr[j-1] ) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
