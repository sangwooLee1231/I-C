package org.example.day11.review;



public class 물건 {
    String name;
    String comp;
    boolean free;
    int price;
    int weight;
    String date;

    static int sum;
    static int count;

    public 물건(String name, String comp, boolean free, int price, int weight, String date) {
        this.name = name;
        this.comp = comp;
        this.price = price;
        this.free = free;
        this.weight = weight;
        this.date = date;

        sum = sum + price;
        count++;
    }

    public static String getSum(){
        return "총 가격 : " + sum;
    }



    public String toString() {
        return "물건{" +
                "제품명='" + name + '\'' +
                ", 회사='" + comp + '\'' +
                ", 무료배송여부=" + free +
                ", 가격=" + price +
                ", 무게=" + weight +
                ", 배송날짜='" + date + '\'' +
                '}';
    }
}