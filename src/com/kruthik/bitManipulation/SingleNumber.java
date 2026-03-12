package com.kruthik.bitManipulation;

public class SingleNumber {
    public static int getSingle(int[] arr) {
        int single = 0;
        for (int n : arr) single ^= n;
        return single;
    }
}
