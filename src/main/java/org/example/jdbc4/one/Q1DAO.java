package org.example.jdbc4.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Q1DAO {
    Connection con;

    public Q1DAO() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/shop2";
        String username = "root";
        String password = "root";
        con = DriverManager.getConnection(url,username,password);
    }

    public Q1VO one(int productid) throws Exception{


        Q1VO vo = new Q1VO();
        String sql = "select * from product where productid=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,productid);

        ResultSet rs = ps.executeQuery();

        if(rs.next())
        {
            vo.setProductid(rs.getInt("productid"));
            vo.setProductname(rs.getString("productname"));
            vo.setPrice(rs.getInt("price"));
            vo.setQuantity(rs.getInt("quantity"));
        } else {
            System.out.println("결과값 없음");
        }

        return vo;
    }
    public ArrayList<Q1VO> all() throws Exception{
        ArrayList<Q1VO> list = new ArrayList<>();

        String sql = "select * from product";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            Q1VO vo = new Q1VO();
            vo.setProductid(rs.getInt("productid"));
            vo.setProductname(rs.getString("productname"));
            vo.setPrice(rs.getInt("price"));
            vo.setQuantity(rs.getInt("quantity"));
        }

        return list;
    }
}
