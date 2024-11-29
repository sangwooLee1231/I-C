package org.example.jdbc4.one;

public class Q1UI {
    public static void main(String[] args) throws Exception {
        Q1DAO dao = new Q1DAO();
        Q1VO vo = dao.one(4);

        System.out.println("검색한 Product id>>" + vo.getProductid());
        System.out.println("검색한 Product name>>" + vo.getProductname());
        System.out.println("검색한 Price>>" + vo.getPrice());
        System.out.println("검색한 Quantity>>" + vo.getQuantity());
        System.out.println("결과 없음");
    }

}
