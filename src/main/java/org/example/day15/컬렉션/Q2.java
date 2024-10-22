package org.example.day15.컬렉션;

import java.util.LinkedList;
import java.util.Queue;

public class Q2 {
    public static void main(String[] args) {
        LinkedList queue = new LinkedList();

        queue.add("국어");
        queue.add("수학");
        queue.add("영어");
        queue.add("컴퓨터");
        System.out.print("처음 시험별 과목:");
        System.out.println(queue);
        queue.remove();
        for(int i=1;i<4;i++)

        {
            System.out.println(i+"회차 시험을 한 날은 과목:"+queue);
            queue.remove();

        }

    }
}
