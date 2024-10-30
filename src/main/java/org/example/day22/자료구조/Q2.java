package org.example.day22.자료구조;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        String[] s = {"밥","커피","밥","커피","밥","밥"};
        HashMap<String,Integer> count = new HashMap<>();
        for(String x:s) {
            count.put(x,count.getOrDefault(x,0)+1);
        }
        System.out.println(count);
        System.out.println(count.get("밥"));
        System.out.println(count.get("커피"));

        if(count.get("밥")>count.get("커피"))
        {
            System.out.println("밥을 더 먹었군요");
        }
        else if(count.get("밥")<count.get("커피"))
        {
            System.out.println("커피를 더 많이마셧군요");
        }
        else System.out.println("없어");

    }
}
