package org.example.day3.array;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        // 정수 배열을 만들어 11,22,33,44,55를 넣으세요
        // 첫번째 값 출력
        // 세번째 값 출력
        // 마지막 값 출력
        // 다 출력

        int b[] = {11,22,33,44,55};
        for (int i = 0; i < b.length; i=i+2)
        {
            System.out.println(b[i]);
        }
        System.out.println(Arrays.toString(b));



        // 실수 배열을 만들어 11.1, 22.2, 33.3을 넣으시오
        // 첫번째 값과 두번째 값을 더해서 프린트
        // 첫번째 값과 마지막 값을 더해서 프린트
        // 배열에 들어있는 전체 개수를 프리트
        // 전체 프린트

        double c[] = {11.1,22.2,33.3};
        System.out.println(c[0]+c[1]);
        System.out.println(c[0]+c[2]);
        System.out.println(c.length);
        System.out.println(Arrays.toString(c));


       /* 3. 개수가 4개인
        문자(char) 배열을 만들어(처음에는 값을 모르고 있는 경우)
        3-1. 첫 번째 위치에 '남'을 넣어, 첫 번째 값 프린트
        3-2. 두 번째 위치에 '여'를 넣어, 첫 번째 값 프린트
        3-3. 전체 개수와 전체 배열의 값을 프린트
        */

        System.out.println("====================");

        char d[] = new char[4];
        d[0] = '남';
        d[1] = '여';
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d.length);
        System.out.println(Arrays.toString(d));

        /*
        4. 개수가 3개인
           문자열(String) 배열을 만들어(처음에는 값을 모르고 있는 경우)
           4-1. 각 인덱스의 자리에 여행가고 싶은 곳을 제일 가고 싶은 곳부터 순서대로
          세 곳을 넣어서 저장(부산, 제주도, 전주인 경우)
          4-2. 전체 프린트
          4-3. 다음과 같이 프린트되도록 처리
          내가 첫 번째 가고 싶은 곳은 부산이고, 마지막 가고 싶은 곳은 전주이다.
       */

        System.out.println("====================");

        String e[] = new String[3];
        e[0] = "부산";
        e[1] = "제주도";
        e[2] = "전주";

        System.out.println(Arrays.toString(e));
        System.out.println("내가 첫 번째로 가고 싶은 곳은 "+e[0]+"이고, 마지막으로 가고 싶은 곳은 "+e[2]+"이다.");

    }

}
