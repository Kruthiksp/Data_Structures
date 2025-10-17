package com.kruthik.arrays;

import java.util.Arrays;

public class SmallestPositiveMissing {

    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        int n = arr.length, i = 0;
        while (i < n) {
            int correctIdx = arr[i] - 1;
            if (i == correctIdx || arr[i] <= 0 || arr[i] > n || arr[i] == arr[correctIdx]) i++;
            else swap(arr, i, correctIdx);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
