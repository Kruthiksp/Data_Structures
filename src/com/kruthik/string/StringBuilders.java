package com.kruthik.string;

public class StringBuilders {
    public static void main(String[] args) {

//        initial Capacity: 16;

        StringBuilder sb = new StringBuilder();
        sb.append("abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOP");
        System.out.println("Current Length: " + sb.length() + " & Max Capacity: " + sb.capacity());

//        Conversion of StringBuilder to String
        String s = sb.toString();
    }
}
