package com.kruthik.hashMap;

import java.util.HashMap;

public class CountPairsDivisibleByK {
    public static long countKdivPairs(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long pairs = 0;

        for (int num : arr) {
            int rem = num % k;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        // Zero check
        if (map.containsKey(0)) {
            long zeroCount = map.get(0);
            pairs += (zeroCount) * (zeroCount - 1) / 2;
        }

        // Check for k/2
        if (k % 2 == 0) {
            long halfCount = map.getOrDefault(k / 2, 0);
            pairs += (halfCount) * (halfCount - 1) / 2;
        }

        for (int i = 1; i <= k / 2; i++) {
            if (i != k - i) { // handled in k/2 case
                pairs += (long) map.getOrDefault(i, 0) * map.getOrDefault(k - i, 0);
            }
        }

        return pairs;
    }
}
