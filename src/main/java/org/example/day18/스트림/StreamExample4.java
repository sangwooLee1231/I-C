package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;
public class StreamExample4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        words.stream().map(a -> a.charAt(0)).forEach(System.out::println);
        // words.stream().map(a -> a.subString(0,1)).forEach(System.out::println);

    }
}
