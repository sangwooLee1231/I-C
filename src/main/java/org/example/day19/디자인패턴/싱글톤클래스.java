package org.example.day19.디자인패턴;

public class 싱글톤클래스 {
    private static 싱글톤클래스 single; //null --> 주소로 변환!
    private 싱글톤클래스(){
        System.out.println("객체 생성됨.!!");
    }

    public static 싱글톤클래스 getInstance(){
        if (single == null) {
            single = new 싱글톤클래스();
        }
        return single;
        //return 생성된싱글톤객체주소;
    }

    public String toString(){
        return single.hashCode() + "";
    }

    //객체를 하나만 만들어서 사용하는 것.
    //생성된 하나의 객체를 싱글톤 객체. <--> 프로토타입
    //외부에서 객체생성을 못하게 막아야 함.
    //new 싱글톤클래스(); //객체생성시 생성자메서드를 반드시 호출하게 되는데,
    //                   ==> 생성자메서드를 외부에서 호출을 못하게 막아버리면 됨.
}