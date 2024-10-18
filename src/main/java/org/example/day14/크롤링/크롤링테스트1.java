package org.example.day14.크롤링;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class 크롤링테스트1 {
    public static void main(String[] args) throws Exception {
        Connection con = Jsoup.connect("https://www.naver.com/"); // return이 Connection
        //Connection : 연결통로를 나타내는 스트림객체
       Document doc  = con.get(); // return이 Document
        // Document(소스코드)
        // 한줄로 정리 Document doc2 = Jsoup.connect("https://www.naver.com/").get();
        // 체인식 코드
       // System.out.println(doc); // 코드를 String으로 만들어줌.
        System.out.println("설치 성공");
    doc.select("span.service_name");// 여러개
        Elements list = doc.select("span.blind");
        System.out.println(list.size());// 개수 --> 3개
        System.out.println(list);  //
       Element e1 =  list.get(0); // <span class = "blind">검색</span>
       String e1Text = e1.text();
       System.out.println(e1Text);

       Element e2 =  list.get(1);
       String e2Text = e2.text();
       System.out.println(e2Text);

       Element e3 =  list.get(2);
       String e3Text = e3.text();
       System.out.println(e3Text);



    }
}
