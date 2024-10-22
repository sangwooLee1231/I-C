package org.example.day16.인터페이스;

public class 컴퓨터사용 {
    public static void main(String[] args) {
        AppleComputer Apple = new AppleComputer();
        BananaComputer Banana = new BananaComputer();
        System.out.println("애플컴퓨터-----------------");
        Apple.start();
        Apple.shutdown();
        Apple.restart();
        System.out.println("바나나컴퓨터-----------------");
        Banana.start();
        Banana.shutdown();
        Banana.restart();

    }
}
