package org.example.day2.control;

import javax.swing.*;
import java.util.Scanner;

public class 순차문2 {
    public static void main(String[] args) {
       /* String answer = "맑음";


        String s = null;
        s = JOptionPane.showInputDialog("날씨가 어때?");

        System.out.println(answer.equals(s));


*/

        double temp = 20;
        double humid = 70;

        String Temp2 = JOptionPane.showInputDialog("온도?");
        String Humid2 = JOptionPane.showInputDialog("습도?");

        double temp3 = Double.parseDouble(Temp2);
        double humid3 = Double.parseDouble(Humid2);

        System.out.println(temp < temp3 && humid < humid3);
        JOptionPane.showMessageDialog(null, temp < temp3 && humid < humid3);


        // 코드 포멧팅 ctrl + Alt + L
    double d = 123.124124123123;
    System.out.println((int)d);
    System.out.printf("%.2f",d);

    }
}