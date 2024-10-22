package org.example.day16.인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ActionListener는 버튼 클릭했을 때 처리 표준으로 만들어놓음.
public class 버튼1처리클래스 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("b1 클릭함");

    }
}
