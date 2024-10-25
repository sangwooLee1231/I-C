package org.example.day19.스트림;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class 기본5 {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(11.1, 22.2, 33.3, 44.4, 55.5);

        // max() 메서드로 최대값을 OptionalDouble로 얻기
        OptionalDouble max = list.stream().mapToDouble(Double::doubleValue).max();
        OptionalDouble min = list.stream().mapToDouble(Double::doubleValue).min();

        // 최대값이 존재하는 경우 출력
        if (max.isPresent()) {
            System.out.println("최대값: " + max.getAsDouble());
        } else {
            System.out.println("리스트가 비어 있습니다.");
        }

        if (min.isPresent()) {
            System.out.println("최소값: " + min.getAsDouble());
        } else {
            System.out.println("리스트가 비어 있습니다.");
        }
    }
}
