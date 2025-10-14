package com.kruthik.recursion;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 13, 8, 6, 25, 32, 16};
        int target = 14;
        boolean found = search(arr, target, 0);
        System.out.println(found);
    }

    private static boolean search(int[] arr, int target, int idx) {
        if(idx == arr.length) return false;
        if(arr[idx] == target) return true;
        return search(arr, target, idx+1);
    }
}
