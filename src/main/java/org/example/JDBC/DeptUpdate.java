package org.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeptUpdate {
    public static void main(String[] args) throws Exception {
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

            String Update = "update dept set deptno = ?, loc = ? where deptno = 10";
            PreparedStatement ps3 = con.prepareStatement(Update);
            ps3.setString(1, DEPTNO);
            ps3.setString(2, LOC);
            ps3.executeUpdate();

            sc.close();
            con.close();



        }
        catch (Exception e) {
            System.out.println("shop2 db연결 실패! ");
        }
    }
}