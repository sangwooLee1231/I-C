package org.example.day18.스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "Hi", "smile");
        List<String> word = new ArrayList<>();
        List<String> word1 = new ArrayList<>();

        words.stream().filter(a->a.length()>4).map(a->a.toUpperCase()).forEach(word::add);
        words.stream().map(a->a+"님").forEach(word1::add);
        System.out.println(word);
        System.out.println(word1);


    }
}
