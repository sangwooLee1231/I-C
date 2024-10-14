package org.example.day10.생성자;

public class Car2 {
    //필드, 멤버변수
    String model;
    String color;
    int maxSpeed;


    public Car2(){
        System.out.println("객체 생성됨!");
    }

    public Car2(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car2(String model) {
        this.model = model;
    }

    //멤버메서드
    public void speedUp(){
        System.out.println("속도UP!");
    }

    //재정의(기존에 있었던 메서드를 내마음대로 수정해서 쓰고 싶을 때)
    // 기존에 있던 것 그대로 다시 뜬다.
    // Car2 c1 = new Car2();
    // c1을 프린트해보면, "패키지이름, 클래스이름@주소" 이런식으로 프린트됨.!
    // c1을 프린트하라고 하면 프린트하기 전에 내부적으로 toString()함수를 통해
    // 위에 있는 스트링으로 미리 만들어, 그것을 프린트하게 되어있음.
    // 주소가 가리키고 있는 힙영역의 객체의 필드값을 toString()으로 만들어서 그 값을
    // 프린트 하는것이 더 유용 ㅇㅇ
    public String toString(){
       return "생성된 객체의 힙형역 데이터: " + model+" "+color+" "+maxSpeed;
    }
}