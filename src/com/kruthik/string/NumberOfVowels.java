package com.kruthik.string;

public class NumberOfVowels {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        int vowels = 0;
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') {
                vowels++;
            }
        }
        System.out.print("Number of vowels: " + vowels);
    }
}
