package com.kruthik.patterns;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();

        // Method - 1
        /*for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                if (i <= j) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }*/

        // Method - 2
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int a = i, b = j;

                if (a > n) {
                    a = 2 * n - i;
                }
                if (b > n) {
                    b = 2 * n - j;
                }
                System.out.print(Math.min(a, b) + " ");
            }
            System.out.println();
        }
    }
}
