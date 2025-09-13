package com.kruthik.string;

public class AllSubStrings {
    public static void main(String[] args) {
        String str = "kruthik";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
    }
}
