package org.example.jdbc4.연습;

import org.example.jdbc4.연습.DeptDAO2;
import org.example.jdbc4.연습.DeptVO2;

public class DeptOneUI2 {
    public static void main(String[] args) throws Exception {
        DeptDAO2 dao = new DeptDAO2(); // 1-2단계 실행
        DeptVO2 bag = dao.one(2);
        System.out.println("검색한 no>>" + bag.getDeptno());
        System.out.println("검색한 name>>" + bag.getDname());
        System.out.println("검색한 loc>>" + bag.getLoc());
    }
}
