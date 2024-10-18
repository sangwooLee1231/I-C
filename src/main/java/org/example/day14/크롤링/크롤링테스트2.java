package org.example.day14.크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class 크롤링테스트2 {
    public static void main(String[] args) throws Exception {
        Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
       Document doc2  = con.get();
        Elements list = doc2.select("span.code"); // 0~여러개
        // <span class = "code" >005930</span> : Element, tag
        System.out.println(list.size()); //1
        System.out.println(list);
        Element e1 = list.get(0);
        String code = e1.text();
        System.out.println(code);

        Elements list2 = doc2.select("span.tx");
        System.out.println(list2.size());
        for(int i=0;i<list2.size();i++){
            Element e2 = list2.get(i); // 각 HTML 요소(span.tx)를 하나씩 가져옴
            String text = e2.text();   // 해당 요소의 텍스트를 가져옴
            System.out.println(text);  // 텍스트 출력
        }

        Elements list3 = doc2.select("div.today span.blind");
        System.out.println(list3.size());
        System.out.println(list3);
            Element e3 = list3.get(0);
            String text1 = e3.text();   // 해당 요소의 텍스트를 가져옴
            System.out.println(text1);  // 텍스트 출력

        Elements list4 = doc2.select("td.first");
        System.out.println(list4);

        Elements list5 = doc2.select("span.blind");
        System.out.println(list5);
        System.out.println(list5.size());

        for(int i=0;i<list5.size();i++){
            System.out.println(i+ ": "+list5.get(i));
        }

        String high = list5.get(14).text();
        String today = list5.get(17).text();
        String yesterday = list5.get(18).text();
        //다음과 같이 프린트해보자.
        //회사명 : 삼성전자
        System.out.println("회사명 : "+ "삼성전자");
        // 코드:
        System.out.println("코드 : "+code);
        // 고가 :
        System.out.println("고가 : "+high);
        // 현재가 :
        System.out.println("현재가 : "+today);
        // 전일가 :
        System.out.println("전일가 : "+yesterday);




    }

}
