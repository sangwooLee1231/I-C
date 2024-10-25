package org.example.day19.스트림;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = new int[3500];

        IntStream.range(1500, 3500).forEach(i -> arr[i] = i);
        OptionalDouble average = Arrays.stream(arr, 1500, 3500).average();
        System.out.println(average.getAsDouble());
    }
}