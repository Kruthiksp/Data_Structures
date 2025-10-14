package com.kruthik.recursion;

import java.util.Scanner;

public class DecreasingIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        printNum(n);
    }

    private static void printNum(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNum(n - 1);
        if (n != 1) System.out.print(n + " ");
    }
}
