package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class 메신저C2 extends JFrame{

    JTextArea list;
    DatagramSocket socket; // 소켓을 멤버 변수로 선언
    int port;

    메신저C2() throws SocketException {
        System.out.println("생성자 시작.");
        setTitle("메신저C2");
        setSize(500, 500);
        getContentPane().setBackground(Color.pink);

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
                list.append("나: " + data + "\n");
                input.setText("");
                try {
                    byte[] data2 = data.getBytes();
                    InetAddress ip = InetAddress.getByName("localhost");
                    // 상대방이 수신할 포트인 5555로 보냄
                    DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, port);
                    socket.send(packet);
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
            System.out.println("b에서 확인 >> " + packet.getAddress());
            System.out.println("b에서 확인 >> " + packet.getPort());
            list.append("너: " + new String(data).trim() + "\n");
            port = packet.getPort();
        }
    }

    public static void main(String[] args) throws Exception {
        메신저C2 m = new 메신저C2();
        m.process();
    }
}
