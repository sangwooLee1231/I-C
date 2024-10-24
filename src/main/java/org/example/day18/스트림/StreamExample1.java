package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class StreamExample1 {
    // 배열에 있는 데이터를 바로 List에 넣을 수 있음.
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
