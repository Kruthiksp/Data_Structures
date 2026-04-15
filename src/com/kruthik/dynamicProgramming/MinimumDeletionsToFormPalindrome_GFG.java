package com.kruthik.dynamicProgramming;

public class MinimumDeletionsToFormPalindrome_GFG {
    public static int countMin(String str) {
        return str.length() - LongestPalindromicSubsequence.longestPalinSubseq(str);
    }
}
