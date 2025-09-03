package com.kruthik.arrays;

import java.util.Arrays;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 90};

//        Shallow Copy
        int[] shallow = arr;
        shallow[6] = 70;
        System.out.println("Original Array after Shallow copy: " + arr[6]);
        System.out.println("Shallow Copied Array " + shallow[6]);

//        Deep Copy
        int[] deep = Arrays.copyOf(arr, arr.length);
        deep[6] = 80;
        System.out.println("Original Array after Deep copy: " + arr[6]);
        System.out.println("Deep Copied Array: " + deep[6]);

    }
}
