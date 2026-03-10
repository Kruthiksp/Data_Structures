package com.kruthik.hashMap;

import java.util.HashMap;

public class PairsWithDifference_K {
    int countPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int count = 0;

        for (int key : map.keySet()) {
            int rem1 = key + k;
            int rem2 = key - k;
            if (map.containsKey(rem1)) count += ((map.get(key)) * (map.get(rem1)));
            if (map.containsKey(rem2)) count += ((map.get(key)) * (map.get(rem2)));
        }
        return count;
    }
}
