package com.kruthik.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Impl {
    public static void main(String[] args) {
        System.out.println();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rahul", 22);
        map.put("Anita", 21);
        map.put("Kiran", 23);
        map.put("Priya", 20);
        map.put("Arjun", 24);

        System.out.println("Removed value: " + map.remove("Kiran"));

        map.put("Sneha", 22);
        map.put("Vikram", 25);
        map.put("Meera", 21);
/*
        for (String key : map.keySet()) {
//            if(key.equals("Priya")) map.remove("Priya"); // ConcurrentModificationException
            System.out.println(key + ": " + map.get(key));
        }
 */
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() <= 22) {
                System.out.println(entry);
            }
        }
    }
}
