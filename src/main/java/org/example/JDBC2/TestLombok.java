package org.example.JDBC2;

public class TestLombok {
    public static void main(String[] args) {
        //1. 가방을 만들자
        ProductVO vo = new ProductVO();
        BoardVO vo1 = new BoardVO();
        //2. 가방에 데이터를 넣는다.
        vo.setNo(1);
        vo.setName("신발");
        vo.setContent("부츠");
        // 3. 가방을 전달하자
        vo.setPrice(10000);
        int no = vo.getNo();
        String name = vo.getName();
        String content = vo.getContent();
        int price = vo.getPrice();
        System.out.println(no + " " + name + " " + content + " " + price);
        System.out.println(vo);

    }
}
