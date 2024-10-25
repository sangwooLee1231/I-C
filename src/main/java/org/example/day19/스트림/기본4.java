package org.example.day19.스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class 기본4 {
    public static void main(String[] args) {
        String[] arr = {"설악산","한라산","집","등","등등"};
        List<String> x = Arrays.stream(arr).filter(a->a.endsWith("산")==true).collect(Collectors.toList());
        x.forEach(System.out::println);


    }
}
