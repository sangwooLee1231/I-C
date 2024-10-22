package org.example.day15.컬렉션;

import java.util.ArrayList;

public class 리스트 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
       // public void add(Object o){...}



        list.add("홍길동");
        list.add(100);
        list.add(11.2);
        list.add(true);
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.add(0,"김길동");
        System.out.println(list);
        list.remove(0);
        list.set(0,"정길동");
        int index =list.indexOf(true);
        System.out.println(index);



        boolean result = list.contains(11.2);
        System.out.println(result);
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);
    }
}
