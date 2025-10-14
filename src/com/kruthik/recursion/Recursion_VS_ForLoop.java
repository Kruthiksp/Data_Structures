package com.kruthik.recursion;

public class Recursion_VS_ForLoop {
    public static void main(String[] args) {
        int n = 10000;

        long start1 = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        print(n);
        long end2 = System.currentTimeMillis();


        System.out.println("\nFor Loop completed in: " + (end1 - start1) + "ms");
        System.out.println("\nRecursion completed in: " + (end2 - start2) + "ms");
    }

    public static void print(int n) {
        if(n==0) return;
        print(n-1);
        System.out.print(n + " ");
    }
}
