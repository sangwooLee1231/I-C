package org.example.day10.정규표현식;

import java.util.regex.Pattern;

public class 정규표현식2 {
    public static void main(String[] args) {
        String name = "김길동";
        String tel = "010-1234-5678";
        String email = "test@naver.com";

        // 입력한 문자열에 대한 유효성 검증! --> 정규표현식을 써라
        // 자바 정규표현식 사용방법은 2가지
        // 1. Pattern.matches(패턴문자열), 검증받고싶은 문자열); --> boolean(true, false)
        // 2. Pattern 미리 등록
        //    Pattern p = Pattern.compile(패턴문자열);  --> 패턴을 나타내는 부품 patter
        //    Matcher m = p.matcher(검증받고싶은 문자열); --> 어떤 패턴을 어떤 문자열에 부분으로 매치를 검증하는지 정보를
        //                                                                                 가지고 있는 부품 Matcher
        //   boolean result2 = m.find(); --> boolean

        System.out.println(Pattern.matches("^[가-힣]*", name));
        System.out.println(Pattern.matches("^010-\\d{3,4}-\\d{4}$",tel));
        System.out.println(Pattern.matches("\\w+@\\w+\\.\\w+",email));

    }
}
