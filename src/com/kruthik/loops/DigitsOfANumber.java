package com.kruthik.loops;

import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int digits = 0;
        do {
            n = n / 10;
            digits++;
        } while (n != 0);

        System.out.println(digits);
    }
}
