package org.example.day18.스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> num = new ArrayList<>();
        List<Integer> num1 = new ArrayList<>();


        numbers.stream().filter(x -> x>3).forEach(num::add);
       numbers.stream().map(a -> a*10).forEach(num1::add);
       System.out.println(num);
       System.out.println(num1);
    }
}
