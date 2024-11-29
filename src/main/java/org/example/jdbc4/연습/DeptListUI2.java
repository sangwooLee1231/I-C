package org.example.jdbc4.연습;

import org.example.jdbc4.연습.DeptDAO2;
import org.example.jdbc4.연습.DeptVO2;

import java.sql.SQLException;
import java.util.ArrayList;

public class DeptListUI2 {
    public static void main(String[] args) throws Exception {
        DeptDAO2 dao = new DeptDAO2(); //1-2단계
        //모든 리스트를 가지고 오자.
        ArrayList<DeptVO2> list = dao.list();
        //반복해서 꺼내서 출력~!  {vo, vo}
        for (DeptVO2 bag: list){
            System.out.println("검색한 no>> " + bag.getDeptno());
            System.out.println("검색한 name>> " + bag.getDname());
            System.out.println("검색한 loc>> " + bag.getLoc());
            System.out.println("------------------------");
        }
    }
}
