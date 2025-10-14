package com.kruthik.recursion;

import java.util.Scanner;

public class A_Power_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();
        long pow = power(a, b);
        System.out.println(a + " raised to the power " + b + " is: " + pow);
    }
//    Time Complexity: O(B)
//    public static long power(int a, int b) {
//        if(b==0) return 1;
//        return a * power(a, b-1);
//    }

    //    Time Complexity: O(log B)
    public static long power(int a, int b) {
        if (b == 0) return 1;
        long call = power(a, b / 2);

        if (b % 2 == 0) return call * call;
        else return a * call * call;
    }
}
