package org.example.day19.스트림;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;

public class 기본1 {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = r.ints(100, 111, 223).sum();
        double avg = sum/100;
        int min1 = r.ints(100, 111, 223).min().getAsInt();
        int max1 = r.ints(100, 111, 223).max().getAsInt();
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(min1);
        System.out.println(max1);


    }
}