package com.kruthik.searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 45, 20, 35, 30, 40, 15, 50, 60, 70};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Search Element: ");
        int target = sc.nextInt();

        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                res = i;
                break;
            }
        }
        if (res >= 0) System.out.println(target + " is present at index: "+ res);
        else System.out.println(target + " Not Found.");

    }
}
