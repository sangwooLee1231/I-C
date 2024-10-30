package org.example.day21.문제풀이;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열컬렉션변환 {
    public static void main(String[] args) {
        String[] s3 = {"박명수", "유재석","김종국","송지효","하하"};
        List<String> list = new ArrayList<>();
        int index = Collections.binarySearch(list, "유재석");
        // BinarySearch는 오름차순에서만 찾을 수 있음.
        // 하지만 이 글에서는 내림차순이라서 -5가 나와 오류(Array Index out of bounds exception) 나옴
        list.addAll(Arrays.asList(s3));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        list.stream().filter(a -> a.length()>=3).forEach(a -> System.out.print(a + " "));
        System.out.println("");
        list.set(1,"유재돌");
        System.out.println(list);
        list.add(2,"김종민");
        System.out.println(list);





    }
}
