package org.example.day16.추상클래스;

public abstract class ApplePhone implements MegaPhone {

    int size;

    public abstract void camera();
        // 상속받은 곳에서 반드시 구현하도록 강제성을 클래스에서 지정하고 싶을 때
        // 클래스내에서 추상메서드 상성 가능..!
        // 이 클래스에서는 객체 생성불가능!
        // body가 있어서는 안된다.
        // 하나라도 추상메서드가 있다면 클래스 자체도 추상메서드여야 한다.


    @Override
    public void siri() {
            System.out.println("시리기능 구현");
    }

    @Override
    public void map() {
            System.out.println("지도기능 구현");

        }

    @Override
    public void internet() {
            System.out.println("인터넷기능 구현");

        }

    @Override
    public void call() {
            System.out.println("전화기능 구현");

        }

    @Override
    public void text() {
            System.out.println("문자기능 구현");

        }

    @Override
    public void kakao() {
            System.out.println("카톡기능 구현");

        }
}

