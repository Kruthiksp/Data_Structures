package com.kruthik.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations_LC {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        boolean[] check = new boolean[arr.length];
        permutations(check, al, ans, arr);
        return ans;
    }

    private void permutations(boolean[] check, List<Integer> al, List<List<Integer>> ans, int[] arr) {
        int n = arr.length;
        if (al.size() == n) {
            ArrayList<Integer> copy = new ArrayList<>(al);
            ans.add(copy);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                al.add(arr[i]);
                check[i] = true;

                permutations(check, al, ans, arr);
                al.remove(al.size() - 1);
                check[i] = false;
            }
        }
    }
}
