package org.example.day18.스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Delta");
        names.add("Eve");

        List<String> filteredNames = names.stream()
                                      .filter(name -> name.startsWith("C"))
                                      .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
