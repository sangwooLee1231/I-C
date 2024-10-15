package org.example.day11.스태틱static;

import java.util.Scanner;

public class BankApllication {

    private static Account[] accounts = new Account[3];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while(true) {


            System.out.println("은행 계좌 관리 어플리케이션");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 계좌 목록 보기");
            System.out.println("3. 계좌 정보 검색");
            System.out.println("4. 계좌 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.println("메뉴를 선택하세요: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    if(count>3)
                    {
                        System.out.println("더 이상 계좌를 생성할 수 없습니다.");
                        break;
                    }
                    count++;
                    sc.nextLine();
                    System.out.println("새 계좌 정보를 입력하세요: (형식: 계좌번호 소유자 잔액)");
                    String[] input = sc.nextLine().split(" ");
                    int accountId = Integer.parseInt(input[0]);
                    String accountName = input[1];
                    int balance = Integer.parseInt(input[2]);
                    Account account = new Account(accountId, accountName, balance);

                    accounts[count++] = account;
                    System.out.println("계좌가 생성되었습니다.");

                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("저장된 모든 계좌 정보를 출력합니다.");
                    for(int i = 0; i<count;i++){
                        System.out.println(accounts[i]);
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("검색할 계좌 번호를 입력하세요: ");
                    int num = Integer.parseInt(sc.nextLine());
                    boolean isTrue = false;
                    for(int i = 0; i<count;i++) {
                        if (accounts[i]!=null&&accounts[i].getAccountId() == num) {
                            System.out.println(accounts[i]);
                            isTrue = true;
                        }
                    }
                      if(!isTrue)
                      {
                          System.out.println("계좌를 찾을 수 없습니다.");
                      }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("삭제할 계좌번호를 입력하세요 : ");
                    int num1 = Integer.parseInt(sc.nextLine());
                    boolean isTrue1 = false;
                    for(int i = 0; i<count;i++) {
                        if (accounts[i].getAccountId() == num1) {
                            accounts[i] = null;
                            System.out.println("계좌가 삭제되었습니다.");
                            isTrue1 = true;
                        }
                    }
                    if(!isTrue1)
                    {
                        System.out.println("계좌를 찾을 수 없습니다.");
                    }

                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("정말 종료하시겠습니까? (Y/N");
                    char ch = sc.next().charAt(0);
                    if(ch == 'Y')
                    {
                        System.out.println("프로그램이 종료되었습니다.");
                        return;
                    }

            }
        }
    }
}