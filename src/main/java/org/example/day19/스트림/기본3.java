package org.example.day19.스트림;

import java.util.ArrayList;
import java.util.List;

public class 기본3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("가");
        list.add("가나");
        list.add("가나다");
        list.add("가나다라");
        list.add("가나다라마");
        list.add("가나다라마바");
        list.add("가나다라마바사");
        list.stream().filter(a->a.length()>=3).forEach(System.out::println);


    }
}
