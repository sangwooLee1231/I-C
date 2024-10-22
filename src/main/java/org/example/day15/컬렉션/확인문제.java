package org.example.day15.컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class 확인문제 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("중국");
        set.add("일본");
        set.add("미국");
        set.add("인도");
        set.add("러시아");
        System.out.println(set);
        //반복문 이용해서 하나씩 꺼내와서 처리
        // 순서X, 인덱스없음.
        // 인덱스가 없어도 for-each는 가능.
        for (Object x: set) {
            System.out.println(x);
        }

    Iterator it = set.iterator();
        /*   while(true)
        {
            if(it.hasNext()) {
                // 꺼내줄것이 있는지 체크 먼저 해야함.
                Object x = it.next(); //꺼내줌
                System.out.println(x);
            }
        }

      */
        while(it.hasNext()) {
            Object x = it.next();
            System.out.println(x);
        }
        // set은 index가 없다
    }
}
