package org.example;

import java.util.HashMap;

public class HashMapss {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("key1", 0);
        scores.put("key2", 1);
        System.out.println(scores.get("key2"));
        System.out.println(scores.containsKey("key2"));
        System.out.println(scores.values());
        System.out.println(scores.keySet());
    }
}
