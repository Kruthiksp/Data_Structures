package com.kruthik.recursion;

public class SubSetSums_2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 6;

        boolean res = helper(arr, target, 0, 0);
        System.out.println(res);

    }

    public static boolean helper(int[] arr, int target, int idx, int sum) {
        if (sum == target) return true;
        if (idx == arr.length) return false;

        if(helper(arr, target, idx + 1, sum + arr[idx])){
            return true;
        }
        return helper(arr, target, idx + 1, sum);
    }
}
