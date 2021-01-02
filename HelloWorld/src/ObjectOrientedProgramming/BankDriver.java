package ObjectOrientedProgramming;

public class BankDriver {
    public static void main(String[] args) {
        // 사람 선언
        Person p1 = new Person();
        p1.name = "신짱구";
        p1.age = 28;
        p1.cashAccount = 30000;

        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.balance = 1000000;

        p1.account = a1;
        a1.owner = p1;

        // 사람 2 선언

        Person p2 = new Person();
        p2.name = "김철수";
        p2.age = 26;
        p2.cashAccount = 100000;

        // 사람 2 은행 계좌 생성
        BankAccount a2 = new BankAccount();
        a2.balance = 500000;

        p2.account = a2;
        p2.owner = p2;
    }
}

