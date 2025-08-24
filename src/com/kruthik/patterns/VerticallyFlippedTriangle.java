package com.kruthik.patterns;

import java.util.Scanner;

public class VerticallyFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side Length: ");
        int n = sc.nextInt();

//        Method - 1
        /*for (int i = 1; i <=n; i++) {
            for (int j = 1;  j <= n ; j++) {
                if ((i+j)>=n+1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }*/


//        Method - 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; i+j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1 ; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
