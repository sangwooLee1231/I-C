package org.example.JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeptDAO {
    Connection conn;

    public DeptDAO() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/shop2";
        String username = "root";
        String password = "1234";
        conn = DriverManager.getConnection(url,username,password);
    }

    public void insert(DeptVO vo) throws Exception {
        String sql = "insert into dept1 values(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, vo.getDeptno());
        ps.setString(2,vo.getDname());
        ps.setString(3,vo.getLoc());

        ps.executeUpdate();
        ps.close();
        conn.close();

    }



}
