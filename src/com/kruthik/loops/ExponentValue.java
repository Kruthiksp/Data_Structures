package com.kruthik.loops;

import java.util.Scanner;

public class ExponentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = sc.nextInt();
        System.out.print("Enter Power: ");
        int power = sc.nextInt();

        int res = 1;

        for (int i = 1; i <= power; i++) {
            res *= base;
        }
        System.out.println(res);
    }
}
