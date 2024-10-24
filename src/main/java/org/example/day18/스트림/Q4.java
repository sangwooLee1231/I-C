package org.example.day18.스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("파인애플", "송아지", "양", "스마일", "소");
        List<String> images = Arrays.asList("1.png", "2.png", "3.jpeg", "4.jpeg");
        List<String> one = new ArrayList<>();
        List<String> image = new ArrayList<>();
        strings.stream().filter(a -> a.length()==1).forEach(one::add);
        System.out.println(one);
        images.stream().filter(a -> a.contains("jpeg")).forEach(image::add);
        System.out.println(image);
    }
}
