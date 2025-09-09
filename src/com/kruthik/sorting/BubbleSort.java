package com.kruthik.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, -15, 30, -25};

        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length - 1; j++) {
            int swaps = 0;
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    //To check whether the array is already sorted in between the process
                    //If the arrays is already sorted swaps will be 0
                    //     else swaps will be > 0
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
