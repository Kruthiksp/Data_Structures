package com.kruthik.bitManipulation;

public class SetKthBit {
    public static int setKthBit(int n, int k) {
        return n | (1 << k);
    }
}
