package org.example.day19.스트림;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        double[] list2 = {11.1,22.2,33.3,44.4};
        System.out.println(Arrays.stream(list2).map(a->a=a+10).sum());
    }
}
