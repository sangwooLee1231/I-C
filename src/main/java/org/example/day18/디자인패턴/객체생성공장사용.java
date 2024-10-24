package org.example.day18.디자인패턴;

import java.util.Scanner;

public class 객체생성공장사용 {
    public static void main(String[] args) {


        객체생성공장클래스 factory = new 객체생성공장클래스();
        factory.getInstance("apple");
        factory.getInstance("banana");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("어떤 객체 생성?(apple. banana입력, exit는 종료");
            String user = sc.next();
            if(user.equalsIgnoreCase("exit"))break;
            Object o = factory.getInstance(user);
            if(o == null) {
                System.out.println("유효하지 않은 입력을 함. 다시 시도!");

            }else{
                System.out.println(user +"가 입력됨!");
            }
        }
        sc.close();
    }
}
