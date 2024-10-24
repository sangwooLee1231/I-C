package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");
        numbers.stream().distinct().forEach(System.out::println);

        List<String> strings = Arrays.asList("apple", "good", "grape", "ice", "melon");
        strings.stream().filter(B->B.length()>=5).map(B -> B.toUpperCase()).forEach(System.out::println);
    }
}
