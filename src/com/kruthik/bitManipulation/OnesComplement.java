package com.kruthik.bitManipulation;

public class OnesComplement {
    public static String onesComplement(String s, int n) {
        StringBuilder res = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '1') res.append('0');
            else res.append('1');
        }

        return res.toString();
    }
}
