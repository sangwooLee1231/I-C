package org.example.day19.스트림;

import java.util.Arrays;

public class 반복문사용 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

       boolean result = Arrays.stream(intArr).allMatch(a->a>=3);
       if(result) {
           System.out.println("모두 3이상");
       }
       else
       {
           System.out.println("모든 수가 3이상은 아니다!");
       }
        System.out.println("-------------");
        int sum = Arrays.stream(intArr)
                .filter(a->a%2 ==0)
                .peek(x -> System.out.println(x))
                .sum();
        System.out.println("-------------");
        System.out.println(sum);
        // peek는 마지막에 나오면 안됨. 그래서 마지막에 출력해야 할 때에는 forEach를 사용
    }
}
