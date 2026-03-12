package com.kruthik.bitManipulation;

public class BinaryToDecimal {
    public static int toDecimal(int binary) {
        int k = 1, decimal = 0;
        while (binary != 0) {
            int num = binary % 10;

            decimal += num * k;
            k *= 2;
            binary /= 10;
        }
        return decimal;
    }
}
