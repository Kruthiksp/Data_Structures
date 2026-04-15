package com.kruthik.dynamicProgramming;

public class FormAPalindrome {
    public static int countMin(String str) {
        return str.length() - LongestPalindromicSubsequence.longestPalinSubseq(str);
    }
}
