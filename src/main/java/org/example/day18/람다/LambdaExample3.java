package org.example.day18.람다;


public class LambdaExample3 {
    public static void main(String[] args) {
        StringFunctionalInterface toUpperCase =  a -> a.toUpperCase();
        String Input = toUpperCase.convert("sadfqwer");
        System.out.println(Input);
    }
}
