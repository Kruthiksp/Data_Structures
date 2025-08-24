package com.kruthik.patterns;

import java.util.Scanner;

public class AlphabetRectangle_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of columns: ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if(i%2 == 0){
                    System.out.print((char)(i + 64) + " ");
                } else {
                    System.out.print((char)(i + 96) + " ");
                }
            }
            System.out.println();
        }
    }
}
