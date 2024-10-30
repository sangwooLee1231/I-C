package org.example.day22.자료구조;

import java.util.Collections;
import java.util.TreeSet;

public class 트리셋연습 {
    public static void main(String[] args) {
       // TreeSet<Integer> n =  new TreeSet<Integer>();
        TreeSet<Integer> n = new TreeSet<Integer>(Collections.reverseOrder());
        n.add(100);
        n.add(1);
        n.add(15);
        n.add(200);
        n.add(400);
        System.out.println(n);
        // 트리셋은 자동정렬 기능이 있고, 오름차순으로 정렬됨.
    }
}
