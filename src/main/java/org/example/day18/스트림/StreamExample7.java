package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class StreamExample7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "lambda", "stream", "example");

            words.stream().map(a -> a.length()).forEach(System.out::println);
            // 'a'를 포함하는문자열만필터링하여출력

    }
}
