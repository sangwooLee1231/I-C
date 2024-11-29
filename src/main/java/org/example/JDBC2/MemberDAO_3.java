package org.example.JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO_3 {
    //DAO클래스는 member테이블의 데이터를 접근해서
    //여러가지 기능을 정의하고 있는 클래스를 말함.
    //db테이블당 dao는 하나씩 만든다.
    //테이블이 1000개이면 dao는 1000개를 만든다.!
    public static void main(String[] args) throws Exception {
        //1. 드라이버 설정 --> 레이지로딩(실행시에 메모리에 올려줌)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        //2. db연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        Connection con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");

        //3. sql준비 --> sql객체


        String sql = "insert into board2 values (?,?,?,?)";
        PreparedStatement ps;

        //insert into member values ('apple',...)
        //ps가 ?를 셋팅하는 역할!
        for(int i=150000;i<1000000;i++) {
           ps = con.prepareStatement(sql);
            ps.setInt(1, i);
            ps.setInt(2, i);
            ps.setInt(3, i);
            ps.setInt(4, i);

            ps.executeUpdate();

        }
        con.close(); //관련 자원들 메모리에서 해제!
    }
}