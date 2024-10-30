package org.example.day21.문제풀이;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Q1 {
    public static void main(String[] args) {
        String s = "배,감,위";
        String[] arr = s.split(",");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] s2 = {"제주도","부산","울릉도"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s2.length;i++){
            sb.append("나도 ");
            sb.append(s2[i]);
            sb.append("가고 싶다. ");
        }
        System.out.println(sb);

        String[] s3 = {"제주도","부산","울릉도"};
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(s3));
        list.add("울산");
        list.add("파주");
        list.add("인천");
        list.remove(0);
        list.set(0,"마산");
        String list2 = Arrays.toString(list.stream().toArray());
        System.out.println(list2);

        String s4 = "마사아차가나";
        char[] z = s4.toCharArray();
        Arrays.sort(z);
        System.out.println(Arrays.toString(z));

        Integer[] s5 = {55,100,77,88,22};
        Arrays.sort(s5);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(s5));
        Collections.reverse(list3);
        IntStream arr3 = list3.stream().mapToInt(Integer::valueOf);
        arr3.forEach(i -> System.out.print(i + " "));
    

    }
}
