package org.example.day12.상속;

public class 쓰레드3 extends Thread {

    public void run(){
        String[] foods = {"a","b","c","d","e","f"};
        for(int i=0;i<foods.length;i++){
            System.out.println(foods[i]);
        }
    }
}
