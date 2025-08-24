package com.kruthik.patterns;

import java.util.Scanner;

public class VerticallyFlippedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side Length: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; i + j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
