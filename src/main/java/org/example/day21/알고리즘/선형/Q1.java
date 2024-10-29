package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};

        // 배열 x의 요소를 list1에 추가
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i : x) {
            list1.add(i);
        }

        // list1의 요소를 뒤집음
        Collections.reverse(list1);

        // list1의 각 요소를 5배로 변환
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i) * 10);
        }

        System.out.println(list1);
    }
}
