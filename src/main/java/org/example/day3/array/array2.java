package org.example.day3.array;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        // 우리 가족 정보를 배열에 넣어보자
        // 5명, 이름, 나이, 키, 성별, 아침여부

        String names[] = {"김길동", "홍길동", "박길동", "송길동", "정길동"};
        // System.out.println(names[0]);
        // System.out.println(names[1]);
        // System.out.println(names[2]);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //for - each
        for(String s : names){
            System.out.println(s);      // names 안에 있는 것들을 하나하나 s로 삽입
        }

        System.out.println(Arrays.toString(names)); // names 배열 안에 있는 것들을 한번에 정렬

        System.out.println("====================");

        int ages[] = {12,23,34,45,56};

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        for(int x : ages){
            System.out.println(x);
        }

        System.out.println(Arrays.toString(ages));

        System.out.println("====================");

        double weight[] = {170,180,170,180,170};
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }

        for(double y : weight){
            System.out.println(y);
        }

        System.out.println(Arrays.toString(weight));

        System.out.println("====================");

        char sex[] = {'남','남','남','여','여'};
        for (int i = 0; i < sex.length; i++) {
            System.out.println(sex[i]);
        }

        for(char a: sex)
        {
            System.out.println(a);
        }
        System.out.println(Arrays.toString(sex));

        System.out.println("====================");

        boolean morning[] = {true,true,false,false,true};
        for (int i = 0; i < morning.length; i++) {
            System.out.println(morning[i]);
        }

        for(boolean b : morning)
        {
            System.out.println(b);
        }

        System.out.println(Arrays.toString(morning));

    }
}
