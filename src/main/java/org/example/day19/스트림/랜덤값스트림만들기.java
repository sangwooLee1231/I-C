package org.example.day19.스트림;

import java.util.Random;
import java.util.stream.IntStream;

public class 랜덤값스트림만들기 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,100).sum()); // --> 마지막값까지 포함
        System.out.println(IntStream.range(1,100).sum()); // --> 마지막값은 포함되지 않음


        Random r = new Random();
        System.out.println(r.ints(100,1,100));
        r.doubles(2000,1,100).sorted().distinct().forEach(System.out::println);



    }
}
