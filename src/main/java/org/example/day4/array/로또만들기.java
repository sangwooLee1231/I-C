package org.example.day4.array;

import java.util.Random;

public class 로또만들기 {
    public static void main(String[] args) {
        int[] lotto = new int[1000];
        Random r = new Random(42);
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = r.nextInt(45);
        }
        for (int x : lotto){
            System.out.println(x+" ");
        }
        System.out.println();
        int count = 0;
        for (int x : lotto) {
            if(x>=30){
                count++;
            }
        }
        System.out.println(count);
    }
}
