package com.kruthik.hashSet;

import java.util.HashSet;

public class LengthOfLongestUniqueSubString {

    int longestUniqueSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int len = 0;

        int i=0, j=0;
        while(j<s.length()) {
            char ch = s.charAt(j);
            if(set.add(ch)) {
                j++;
            }
            else {
                len = j-i;
                maxLen = Math.max(len, maxLen);
                while(s.charAt(i) != ch) {
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        len = j-i;
        maxLen = Math.max(len, maxLen);
        return maxLen;
    }

}
