package com.kruthik.recursion;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int res = 0;
        res = reverse(n ,res);
        System.out.println(res);
    }

    public static int reverse(int n, int res) {
        if(n==0) return res;
        res = res * 10 + (n%10);
        return reverse(n/10, res);
    }
}
