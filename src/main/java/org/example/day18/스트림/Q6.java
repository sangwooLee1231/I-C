package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Q6{
public static void main(String[] args) {
    List<Student> list = Arrays.asList(
            new Student("hong", 100),
            new Student("kim", 90),
            new Student("jung", 80),
            new Student("park", 70),
            new Student("moon", 95)
    );

    OptionalDouble IntStream = list.stream().mapToInt(Student::getScore).average();

    if(IntStream.isPresent()) {
        System.out.println(IntStream.getAsDouble());
    }
    else{
        System.out.println("평균값을 구할수 없음");
    }
    }
}