package com.kruthik.searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Search Element: ");
        int target = sc.nextInt();

        int res = -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                res = mid;
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (res >= 0) System.out.println(target + " Found at index: " + res);
        else System.out.println(target + " Not Found");
    }
}
