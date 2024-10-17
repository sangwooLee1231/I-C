package org.example.day13.예외처리;



public class Account {
    private long balance;

    public class InsufficientException extends Exception {
        public InsufficientException(String message) {
            super(message);
        }
    }
    public Account() { }

    public long getBalance() {
        return balance;
    }


    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException{
        if(balance<money) {
            throw new InsufficientException("잔고 부족:" + (money - balance) + " 모자람");
        }
        balance -= money;
    }


}
