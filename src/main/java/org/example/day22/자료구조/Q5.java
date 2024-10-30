package org.example.day22.자료구조;

import java.util.HashMap;

public class Q5 {
    public static void main(String[] args) {
        String s5 = "감고나무감나무신세계신";
        char[] arr = s5.toCharArray();
        HashMap<String, Integer> count = new HashMap<>();

        for (char x : arr) {
            String key = String.valueOf(x);
            count.put(key, count.getOrDefault(key, 0) + 1);

        }
        System.out.println(count);

    }
}
