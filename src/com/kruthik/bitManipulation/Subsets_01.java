package com.kruthik.bitManipulation;

import java.util.ArrayList;

public class Subsets_01 {
    public static ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = arr.length;
        int m = 1 << n;

        for (int i = 0; i < m; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i >> j) % 2 == 1) al.add(arr[j]);
            }
            res.add(al);
        }
        return res;
    }
}
