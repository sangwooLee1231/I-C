package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;

public class 메신저C4 extends JFrame{

    public static ArrayList<Integer> ports = 메신저A4.ports;

    JTextArea list;
    DatagramSocket socket; // 소켓을 멤버 변수로 선언
    int port;
    //int start = 0;
    int me = 9999;
    InetAddress ip;

    메신저C4() throws Exception {
        System.out.println(ports);
        System.out.println("생성자 시작.");
        setTitle("메신저C4");
        setSize(500, 250);
        getContentPane().setBackground(Color.pink);
        ip = InetAddress.getByName("localhost");
        list = new JTextArea();
        JTextField input = new JTextField();
        setLayout(new BorderLayout());
        add(list, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);

        list.setBackground(Color.green);
        Font font = new Font("굴림", Font.BOLD, 30);
        list.setFont(font);
        input.setBackground(Color.BLUE);
        input.setForeground(Color.white);
        input.setFont(font);
        list.setLineWrap(true);
        list.setAutoscrolls(true);
        list.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 5555번 포트에서 소켓을 열어둡니다.
        socket = new DatagramSocket(9999);

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = input.getText();
                list.append("9999: " + data + "\n");
                input.setText("");
                try {
                    byte[] data2 = data.getBytes();

                    for (int port : ports) {
                        System.out.println("--" + port);
                        if (port != me) {
                            DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, port);
                            socket.send(packet);
                        }
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        setVisible(true);
    }

    public void process() throws Exception {
        //DatagramSocket socket = new DatagramSocket(5555);
        while (true) {
            byte[] data = new byte[30];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            System.out.println("c에서 확인 >> " + packet.getAddress());
            System.out.println("c에서 확인 >> " + packet.getPort());
            port = packet.getPort();
            list.append(port + ": " + new String(data).trim() + "\n");
        }
    }

    public static void main(String[] args) throws Exception {
        메신저C4 m = new 메신저C4();
        m.process();
    }
}
