package org.example.day13.예외처리;

public class 예외처리문제 {
    public static void main(String[] args) {


        String[] names = {"홍길동", "김길동"};
        try {
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생");
            System.out.println(e.getMessage());
        }
        int[] ages =null;
        try {

            System.out.println(ages.length);
        } catch (NullPointerException e) {
            System.out.println("예외 발생");
            System.out.println(e.getMessage());
        }
    }

}
