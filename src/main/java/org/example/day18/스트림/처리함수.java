package org.example.day18.스트림;

public class 처리함수 {
    public static void staticPrint(String content) {
        System.out.println("*** " + content + " ***");
    }

    public void generalPrint(String name, String job) {
        System.out.println("@@@ " +name + " $$$" + job);
    }
}
