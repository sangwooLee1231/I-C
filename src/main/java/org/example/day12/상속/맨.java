package org.example.day12.상속;

public class 맨 extends 사람{
    int power;

    public 맨(char gender, String name, int power) {
        //super()항상 맨 첫줄에 써야함.!
        super(gender, name);
        this.power = power;
    }

    //public 맨(){
    // super(); //상속받는 클래스에서 생성자 호출시
    //부모객체부터 먼저 만들어야 파생이 되므로
    //부모 클래스의 생성자부터 먼저 호출해야함.
    // }


    public void 달리다(){
        System.out.println("빨리 달리다.");
    }
}