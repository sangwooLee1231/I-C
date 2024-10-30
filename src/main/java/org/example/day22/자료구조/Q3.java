package org.example.day22.자료구조;

import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {


        TreeSet<Integer> t = new TreeSet<>();
        int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3};
        for (int i = 0; i < s3.length; i++) {
            t.add(s3[i]);
        }
        System.out.println(t.last());
        System.out.println(t.first());
    }
}
