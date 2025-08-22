package com.kruthik.loops;

import java.util.Scanner;

public class Arithmetic_Progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter d: ");
        int d = sc.nextInt();
//        System.out.print("Enter limit: ");
//        int n = sc.nextInt();

        for(int i=1 ; a>0 ; i++) {
            System.out.print(a + " ");
            a += d;
        }
    }
}
