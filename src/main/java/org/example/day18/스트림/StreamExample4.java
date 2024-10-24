package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;
public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3, 5, -1, 7, -8, 2);

        numbers.stream().filter(a -> a<0).forEach(System.out::println);
    }
}
