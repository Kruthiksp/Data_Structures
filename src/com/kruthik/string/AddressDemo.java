package com.kruthik.string;

public class AddressDemo {
    public static void main(String[] args) {
        String str1 = new String("kruthik");
        String str2 = new String("kruthik");

        String str3 = "kruthik";
        String str4 = "kruthik";

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
