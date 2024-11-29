package org.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class SchoolDBConnect {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/shop2";
            String id = "root";
            String pw = "1234";


            Connection con = DriverManager.getConnection(url, id, pw);
            System.out.println("shop2 db연결 성공!");

            Scanner sc = new Scanner(System.in);
    System.out.println("명령어 입력>>");
    System.out.print("deptno 입력 >>");
    String DEPTNO = sc.next();
    System.out.print("dname 입력 >>");
    String DNAME = sc.next();
    System.out.print("loc 입력 >>");
    String LOC = sc.next();


    String insert = "insert into dept values (?,?,?)";
    PreparedStatement ps = con.prepareStatement(insert);
    ps.setString(1, DEPTNO);
    ps.setString(2, DNAME);
    ps.setString(3, LOC);
    System.out.println("완료");
    ps.executeUpdate();


    String delete = "delete from dept where deptno = ?";
    PreparedStatement ps2 = con.prepareStatement(delete);
    ps2.setString(1, DEPTNO);
    System.out.println("완료");
    ps2.executeUpdate();


    String Update = "update dept set deptno = ?, loc = ?";
    PreparedStatement ps3 = con.prepareStatement(Update);
    ps3.setString(1, DEPTNO);
    ps3.setString(2, LOC);
    ps3.executeUpdate();

            sc.close();
            con.close();



        } catch (Exception e) {
            System.out.println("shop2 db연결 실패! ");
        }
    }
}
