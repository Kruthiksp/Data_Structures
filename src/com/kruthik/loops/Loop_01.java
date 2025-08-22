package com.kruthik.loops;

import java.util.Scanner;

public class Loop_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            System.out.println(n);
            n--;
        }
    }
}
