package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;

public class 메신저B extends JFrame {
    메신저B() {
        // 여기에 코드 다하면, static이 아니여서 더 좋은 코드를 만들 수 있음.
        System.out.println("생성자 시작.");
        setTitle("메신저B");
        setSize(500,500);
        getContentPane().setBackground(Color.yellow);
        setVisible(true);

    }

    public static void main(String[] args) {
        메신저B m = new 메신저B();

    }


}
