package org.example.day15.컬렉션;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("자바");

        list.add(new ArrayList());

        String s = (String)list.get(0);

        list.add(100);

        int i = (Integer)list.get(3);
    }
}
