package org.example.jdbc4.one;

import java.sql.SQLException;

public class DeptOneUI {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DeptDAO dao = new DeptDAO(); //1-2단계 실행!
        DeptVO bag = dao.one(3); //3-4단계
        if(bag != null) {
            System.out.println("검색한 no>> " + bag.getDeptno());
            System.out.println("검색한 name>> " + bag.getDname());
            System.out.println("검색한 loc>> " + bag.getLoc());
        }else{
            System.out.println("검색결과가 없음.!");
        }
    }
}
