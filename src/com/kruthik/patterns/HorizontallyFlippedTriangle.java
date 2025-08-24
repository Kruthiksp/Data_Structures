package com.kruthik.patterns;

import java.util.Scanner;

public class HorizontallyFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side Length: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; i + j <= n + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
