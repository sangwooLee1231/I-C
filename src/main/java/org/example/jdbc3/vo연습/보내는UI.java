package org.example.jdbc3.vo연습;

import java.util.Scanner;

public class 보내는UI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름입력>> ");
        String name = sc.next();
        System.out.print("나이입력>> ");
        int age = sc.nextInt();//String --> int로 변환해줌.
        System.out.print("취미입력>> ");
        String hobby = sc.next();
        System.out.print("전화번호입력>> ");
        String phone = sc.next();

        //가방을 만들어서
        Bag bag = new Bag();
        //값을 넣고
        bag.setName(name);
        bag.setAge(age);
        bag.setHobby(hobby);
        bag.setTel(phone);
        //값을 전달하자.
        //예쁘게 프린트를 하고 싶은 경우 프린트 기능이 있는 클래스를 찾으세요.!
        받는DAO dao = new 받는DAO();
        dao.print(bag);

        sc.close();
    }
}
