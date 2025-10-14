package com.kruthik.recursion;

import java.util.ArrayList;

public class SubSetSums_1 {
    public static void main(String[] args) {
        int[] arr = {2, 3};
        ArrayList<Integer> res = new ArrayList<>();
        subArraySum(0, arr, 0, res);
        System.out.println(res);
    }

    private static void subArraySum(int sum, int[] arr, int idx, ArrayList<Integer> res) {
        if (idx == arr.length) {
            res.add(sum);
            return;
        }
        int num = arr[idx];
        subArraySum(sum, arr, idx + 1, res);
        subArraySum(sum + num, arr, idx + 1, res);
    }
}
