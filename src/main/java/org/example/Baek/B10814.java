package org.example.Baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }
}

public class B10814 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people.add(new Person(age, name));
        }

        // 나이를 기준으로 정렬하되, 나이가 같으면 입력 순서를 유지
        people.sort(Comparator.comparingInt((Person p) -> p.age));

        // 출력
        people.forEach(System.out::println);
    }
}


