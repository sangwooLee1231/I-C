package org.example.day13.상속;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Click {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Font font = new Font("굴림",Font.BOLD,25);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Button click Counter");
        frame.setSize(500,600);



        JLabel l1 = new JLabel();
        l1.setFont(font);
        
        frame.add(l1);

        l1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

            }
        })



        frame.setVisible(true);

    }
}
