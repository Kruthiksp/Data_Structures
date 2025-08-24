package com.kruthik.patterns;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k += 2;
            }
            System.out.println();
        }

    }
}
