package org.example.day15.컬렉션;



import java.util.LinkedList;

public class 큐 {
    public static void main(String[] args) {
        // Queue, 큐, 대기줄
        LinkedList queue = new LinkedList();
        // 순서, First In First Out
        queue.add("어제먹은 우유");
        queue.add("오늘먹을 우유");
        queue.add("내일먹을 우유");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);






    }
}
