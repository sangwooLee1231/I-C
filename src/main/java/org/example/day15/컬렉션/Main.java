package org.example.day15.컬렉션;

public class Main {


    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("홍길동");
        stack.push("김길동");
        stack.push("박길동");
        stack.push("정길동");
        String pop_result = stack.pop();
        System.out.println("pop()결과>> "+ pop_result);

        System.out.println("전체 목록>> "+stack.getList());
        System.out.println("비어있는지 여부>> "+(stack.isEmpty() ? "비었음" : "안비었음"));
        String peek_result = stack.peek();
        System.out.println("peek()결과>> "+peek_result);

    }





}
