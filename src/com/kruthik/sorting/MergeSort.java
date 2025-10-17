package com.kruthik.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 30, 15, 25, 40, 20, 35, 50, 45, -20, -5};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;

        // Base-Case
        if (n == 1) return;

        // Step - 1 : Create 2 Arrays of n/2 & n - n/2 length
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Step - 2 : Copy Elements to new Arrays
        int idx = 0;
        for (int i = 0; i < a.length; i++) a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++) b[i] = arr[idx++];

        // Step - 3 : Call Recursion
        mergeSort(a);
        mergeSort(b);

        // Step - 4 : merge 2 unsorted Arrays
        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
