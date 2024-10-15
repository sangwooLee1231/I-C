package org.example.day11.review;

public class 물건사용 {

    public static void main(String[] args) {
        물건 coffee1 = new 물건("아이스 커피믹스", "맥심", true, 19500, 1430, "24-10-16");
        물건 coffee2 = new 물건("아이스 아메리카노", "이디야", true, 12600, 100, "24-10-16");
        물건 coffee3 = new 물건("아이스 블렌드 아메리카노", "카누", true, 21990, 120, "24-10-16");

        System.out.println(coffee1);
        System.out.println(coffee2);
        System.out.println(coffee3);
        System.out.println("물건 개수" + 물건.count);
        System.out.println(물건.getSum());
    }



}