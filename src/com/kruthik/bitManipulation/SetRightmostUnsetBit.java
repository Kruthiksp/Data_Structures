package com.kruthik.bitManipulation;

public class SetRightmostUnsetBit {
    public static int setBit(int n) {
        return n | n + 1;
    }
}
