package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.collections4.IteratorUtils.forEach;

public class StreamExample2 {
    public static void main(String[] args) {


        List<String> words = Arrays.asList("hi", "hello", "sun", "sky", "sea");
        words.stream().filter(x -> x.length() >= 3)
                .forEach(System.out::println);
    }
}
