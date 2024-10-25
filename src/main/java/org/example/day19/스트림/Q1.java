package org.example.day19.스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<Double>();
        list1.add(1000.0);
        list1.add(2000.0);
        list1.add(3000.0);
        list1.add(4000.0);
        list1.add(5000.0);
        list1.stream().map(a -> a = a - 1000.0).forEach(System.out::println);
    }
}
