package org.example.jdbc3.read연습;

import java.util.Scanner;

public class DeptOneUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 no입력>> ");
        int deptno = sc.nextInt();
        sc.close();

        DeptDAO dao = new DeptDAO();
        DeptVO bag = dao.one(deptno);
        System.out.println(bag);
    }
}
