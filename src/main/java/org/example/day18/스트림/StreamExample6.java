package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class StreamExample6 {
    public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig");

            words.stream().filter(a -> a.contains("a")).forEach(System.out::println);
            // 'a'를 포함하는문자열만필터링하여출력

    }
}
