package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class StreamExample5 {
    public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        numbers.stream().filter(a -> a%2==1).map(a->a*a).forEach(System.out::println);

    }
}
