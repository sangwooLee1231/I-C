package org.example.day14.크롤링;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 크롤러 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Document doc = Jsoup.connect("https://www.gorang.store/main.bo").get();

            Elements eList = doc.select("#commonContentInfoBox");

            // 제목과 조회수를 저장하는 2차원 배열
            String[][] views = new String[eList.size()][2];

            for (int i = 0; i < views.length; i++) {
                Element element = eList.get(i);

                // 제목 추출
                Elements el = element.select("#boardTitle");
                for (Element el1 : el) {
                    views[i][0] = el1.text(); // 제목
                }

                // 조회수 추출
                Elements el2 = element.select("#boardCount span");
                for (Element el1 : el2) {
                    views[i][1] = el1.text(); // 조회수
                }
            }

            // 조회수 및 제목을 기준으로 정렬
            Arrays.sort(views, (a, b) -> {
                int viewCompare = Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])); // 조회수 내림차순
                if (viewCompare != 0) {
                    return viewCompare; // 조회수가 다르면 조회수로 정렬
                }
                return a[0].compareTo(b[0]); // 조회수가 같으면 제목으로 정렬 (가나다 순)
            });


            System.out.println("엑셀 파일로 저장되었습니다.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
