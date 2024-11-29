package org.example.JDBC2;

import java.util.Scanner;

public class DeptInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("DEPTNO 입력");
        String deptno = sc.next();
        System.out.println("DNAME 입력");
        String dname = sc.next();
        System.out.println("LOC 입력");
        String loc = sc.next();
        sc.close();
        DeptDAO dao = new DeptDAO();
        DeptVO vo = new DeptVO();
        vo.setDeptno(deptno);
        vo.setDname(dname);
        vo.setLoc(loc);
        dao.insert(vo);
    }
}
