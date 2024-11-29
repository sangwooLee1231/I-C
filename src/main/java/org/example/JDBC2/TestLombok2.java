package org.example.JDBC2;

public class TestLombok2 {
    public static void main(String[] args) {
        //1. 가방을 만들자
        BoardVO vo1 = new BoardVO();
        //2. 가방에 데이터를 넣는다.
        vo1.setNo(1);
        vo1.setTitle("신발");
        vo1.setContent("부츠");
        // 3. 가방을 전달하자
        vo1.setWriter("hong");
        int no = vo1.getNo();
        String title = vo1.getTitle();
        String content = vo1.getContent();
        String price = vo1.getWriter();
        System.out.println(no + " " + title + " " + content + " " + price);
        System.out.println(vo1);

    }
}
