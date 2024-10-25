package org.example.day19.스트림;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random r = new Random();
        r.doubles(100,3500,4001).distinct().sorted().forEach(System.out::println);

    }
}
