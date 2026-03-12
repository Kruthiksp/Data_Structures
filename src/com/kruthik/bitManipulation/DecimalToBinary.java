package com.kruthik.bitManipulation;

public class DecimalToBinary {
    public static int toBinary(int n) {
        if (n == 0) {
            System.out.print(0);
            return 0;
        }

        StringBuilder binary2 = new StringBuilder();
        while (n > 0) {
            binary2.append(n % 2);
            n = n / 2;
        }
        return Integer.parseInt(binary2.reverse().toString());
    }
}
