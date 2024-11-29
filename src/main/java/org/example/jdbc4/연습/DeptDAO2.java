package org.example.jdbc4.연습;

import org.example.jdbc4.연습.DeptVO2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DeptDAO2 {
    Connection con;

    public DeptDAO2() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        String url = "jdbc:mysql://127.0.0.1:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url,id,pw);
        System.out.println("2. db연결 성공!");
    }

    // crud 기능별 메서드를 추가하면 됨.
    // 각각의 메서드에는 jdbc 3-4단계만 넣음
    // read(select문 작업, 검색)
    // 검색결과가 row 1개, row 여러 개일때마다 작업이 약간 다름.
    // one(int deptno), list()
    public DeptVO2 one(int deptno) throws Exception {
        DeptVO2 bag = new DeptVO2();
        String sql = "select * from dept where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,deptno);

        ResultSet table = ps.executeQuery();
        if(table.next()){
            bag.setDeptno(table.getInt("deptno"));
            bag.setDname(table.getString(2));
            bag.setLoc(table.getString("loc"));
        }
        return bag;

    }

    public ArrayList<DeptVO2> list() throws Exception {
        ArrayList<DeptVO2> list = new ArrayList<>();
        String sql = "select * from dept";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet table = ps.executeQuery();
        while(table.next()){
            DeptVO2 bag = new DeptVO2();
            bag.setDeptno(table.getInt("deptno"));
            bag.setDname(table.getString(2));
            bag.setLoc(table.getString("loc"));
            list.add(bag);
        }
    return list;

    }

}
