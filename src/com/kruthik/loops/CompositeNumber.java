package com.kruthik.loops;

import java.util.Scanner;

public class CompositeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        boolean composite = false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                composite = true;
                break;
            }
        }
        if (n == 1) {
            System.out.println("Neither Prime Nor Composite");
        } else if (composite) {
            System.out.println("Composite Number");
        } else {
            System.out.println("Prime Number");
        }
    }
}
