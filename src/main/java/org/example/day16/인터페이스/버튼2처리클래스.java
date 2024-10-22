package org.example.day16.인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ActionListener는 버튼 클릭했을 때 처리 표준으로 만들어놓음.
public class 버튼2처리클래스 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("b2 클릭함");
    }

    // 추가기능도 더 넣을 수 있음.
}
