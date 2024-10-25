package org.example.day19.디자인패턴;

import java.util.ArrayList;
import java.util.Arrays;

public class 에어컨 implements 관찰자 {
    ArrayList<String> managers;

    public 에어컨() {
        managers = new ArrayList<>(Arrays.asList("Alice", "Hong", "Park"));
    }

    @Override
    public void update(int temp) {
        System.out.println(temp + "도가 변경되었습니다.");
    }

    void setTemp(int temp) {
        // 각 관리자 이름을 "님"과 함께 출력하는 방식
        for (String s : managers) {
            System.out.print(s+"님 ");
                    update(temp);
        }
    }

}
