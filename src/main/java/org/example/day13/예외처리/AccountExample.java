package org.example.day13.예외처리;

public class AccountExample {

    public static void main(String[] args) {
        Account account = new Account();


        account.deposit(10000);
        System.out.println("예금액 :"+account.getBalance());

        try{
            account.withdraw(30000);
        } catch (Account.InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

    }
}
