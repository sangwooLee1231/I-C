package org.example.day19.스트림;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

public class 기본2 {
    public static void main(String[] args) {


        Random r = new Random();
        double[] arr = r.doubles(200, 11.1, 55.5).toArray();
        System.out.println(arr.length);
        System.out.println(arr[0]);
        Arrays.stream(arr).average().ifPresent(System.out::println);
    }
}
