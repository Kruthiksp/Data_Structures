package com.kruthik.bitManipulation;

public class UnSetKthBit {
    public static int setKthBit(int n, int k) {
        int num = ~(1 << k);
        return n & num;
    }
}
