package com.kruthik.arrays;

import java.util.Arrays;

public class OddEvenIndexed {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Original Array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + 10;
            } else {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
