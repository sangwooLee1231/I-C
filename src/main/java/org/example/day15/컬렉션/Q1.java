package org.example.day15.컬렉션;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import static javax.swing.UIManager.put;

public class Q1 {
    public static void main(String[] args) {


        HashMap map = new HashMap();
        map.put(1, "박소정");
        map.put(2,"김경민");
        map.put(3,"소지현");
        map.put(4,"김개빈");
        Set keys = map.keySet();
        Collection values = map.values();
        System.out.println("초기 참가자 목록:" +values);
        System.out.println("김경민 탈락");
        map.remove(2);
        System.out.println("탈락 후 참가자 목록: "+values);
        System.out.println("1등: "+ map.get(1));
        System.out.println("2등: "+ map.get(3));
        System.out.println("3등: "+ map.get(4));


    }
}
