package org.example.day2.control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class 인기투표 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(600,700);
        FlowLayout layout = new FlowLayout();
        f.setLayout(layout);

        Font font = new Font("궁서",Font.BOLD,20);

        JLabel l1 = new JLabel();
        l1.setText("인기투표 시스템");
        l1.setFont(font);


        JButton b1 = new JButton("");

        JButton b2 = new JButton("");

        JButton b3 = new JButton("");

        ImageIcon icon1 = new ImageIcon("001.png");
        b1.setIcon(icon1);

        ImageIcon icon2 = new ImageIcon("002.png");
        b2.setIcon(icon2);

        ImageIcon icon3 = new ImageIcon("003.png");
        b3.setIcon(icon3);


        JLabel l2 = new JLabel();
        l2.setText("아이유");

        JLabel l3 = new JLabel();
        l3.setText("프로미스나인");

        JLabel l4 = new JLabel();
        l4.setText("스테이시");


        f.add(l1);
        f.add(b1);
        f.add(l2);
        f.add(l3);
        f.add(b2);
        f.add(b3);
        f.add(l4);


        b1.addActionListener(new ActionListener() {
            int iu = 0;
            public void actionPerformed(ActionEvent e) {
                //b1이 클릭될 때마다 자동으로 실행되는 코드!
                iu++;
                l2.setText("아이유>>"+iu);
                System.out.println("버튼 1 클릭됨");


            }
        });

        b2.addActionListener(new ActionListener() {
            int fromis9 = 0;
            public void actionPerformed(ActionEvent e) {
                fromis9++;
                l3.setText("프로미스나인>>"+fromis9);
                System.out.println("버튼 2 클릭됨");
            }
        });


        b3.addActionListener(new ActionListener() {
            int stacy = 0;
            public void actionPerformed(ActionEvent e) {
                stacy++;
                l4.setText("스테이시>>"+stacy);
                System.out.println("버튼 3 클릭됨");
            }
        });


        f.setVisible(true);

    }
}
