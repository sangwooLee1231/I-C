package org.example.day17.네트워크;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //보내는 전화기역할 부품 --> DatagramSocket
        DatagramSocket socket = new DatagramSocket();
        //주소: ip(InetAddress) + port(int)
        InetAddress ip = InetAddress.getByName("127.0.0.1");
      //  Connection con = Jsoup.connection();

        // 램에 어느 주소에 부품이 있는 지 알면, 그거를 쓰면 됨.
        // 없으면, new생성해서 넣어줌.
        // DatagramSocket ds = new DatagramSocket();
        // 데이터: String --> byte[]
        System.out.println("데이터를 입력하시오");
        String s = sc.nextLine();
        byte[] data = s.getBytes();
        // 패킷 --> DatagramPacket(데이터, 주소)
        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);

        // 소켓으로 패킷을 보내자.
        socket.send(packet);
        System.out.println("클라이언트 포트>>> "+ packet.getPort());
        // 소켓 자원해제.
        socket.close();

    }





}