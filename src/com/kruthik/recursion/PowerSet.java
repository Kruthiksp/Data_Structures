package com.kruthik.recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        String str = "abcd";
        List<String> res = new ArrayList<>();
        subsequence("", str, 0, res);
        System.out.println(res );
    }

    private static void subsequence(String ans, String str, int idx, List<String> res) {
        if (idx == str.length()) {
            if(!ans.isEmpty()) res.add(ans);
            return;
        }
        char ch = str.charAt(idx);
        subsequence(ans + ch, str, idx+1, res);
        subsequence(ans, str, idx+1, res);
    }
}
