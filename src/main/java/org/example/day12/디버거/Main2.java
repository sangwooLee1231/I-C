package org.example.day12.디버거;

public class Main2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = add(a,b);
        System.out.println("결과:" + result);
    }
    // 누를때마다 선택되고 취소되는 기능을 "toggle"기능이라 함.

    public static int add(int a, int b) {
        int sum = a+b;
        return sum;
    }
}
