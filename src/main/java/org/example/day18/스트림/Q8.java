package org.example.day18.스트림;

import java.util.Arrays;
import java.util.OptionalInt;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 10, 40, 2};
        int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10};
        Arrays.stream(arr).filter(a -> a % 2 == 1).forEach(System.out::print);
        System.out.println(Arrays.stream(arr2).max().getAsInt());
        Arrays.stream(arr3).filter(a -> a > 5).distinct().forEach(System.out::println);


        /*
        OptionalInt max2 = Arrays.stream(arr3).max();
        System.out.println(max2);
        if(max2.isPresent()){
            System.out.println(max2.getAsInt());
        }else {
            System.out.println("최대값이 없음");
        }
    }

         */
    }
}
