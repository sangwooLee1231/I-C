package org.example.day18.람다;

public class LambdaExample4 {
    public static void main(String[] args) {
        StringLengthFunctionalInterface length = a -> a.length();
        int Input = length.getLength("asdfqwer");
        System.out.println(Input);

    }
}
