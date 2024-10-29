package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Q2 {
    public static void main(String[] args) {


        Integer[] x = {1, 2, 3, 4, 5};
        List<Integer> list3 = new ArrayList<>(Arrays.asList(x));
        list3.add(6);
        list3.add(7);
        System.out.println(list3);
    }
}
