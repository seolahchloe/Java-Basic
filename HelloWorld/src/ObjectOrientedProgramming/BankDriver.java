package ObjectOrientedProgramming;

public class BankDriver {
    public static void main(String[] args) {
        // 사람 선언
        Person p1 = new Person();
        p1.setName("신짱구");
//        p1.age = 28;
//        p1.age = -10;
        p1.setAge(28);
        p1.setAge(-10);
        p1.setCashAmount(30000);

        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.setBalance(100000);

        p1.setAccount(a1);
        a1.setOwner(p1);

        // 사람 2 선언

        Person p2 = new Person();
        p2.setName("김철수");
        p2.setAge(26);
        p2.setCashAmount(100000);

        // 사람 2 은행 계좌 생성
        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);

        p2.setAccount(a2);
        a2.setOwner(p2);

        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));
    }
}
