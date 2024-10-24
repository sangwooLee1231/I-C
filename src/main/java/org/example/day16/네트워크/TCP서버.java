package org.example.day16.네트워크;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP서버 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9000);
        //1.서버가 start
        //ip는 컴퓨터 따라감.
        while (true){
            System.out.println("서버가 돌아가는 중.");
            Socket socket = server.accept();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("I am a java programmer!!");
            out.close();
            socket.close();
        }
    }
}