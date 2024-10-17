package org.example.day13.예외처리;

public class 배열에러처리Main2 {
    public static void main(String[] args) {
        배열에러2 ar2 = new 배열에러2();
        try {
            ar2.array();
        } catch (Exception e) {
            System.out.println("처리완료");
        }
        System.out.println("나도 프린트될까요...");
    }
}