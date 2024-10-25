package org.example.day19.스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QQ5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        List<Double> result =  numbers.stream()
                .map(a -> a * 3)
                .filter(a -> a % 2 == 0)
                .mapToDouble(a -> Math.sqrt((double) a))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
