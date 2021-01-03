package ObjectOrientedProgramming;

public class BankAccount {
    private int balance;
    private Person owner;

    public void setBalance (int newBalance) {
        balance = newBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner (Person newOwner) {
        owner = newOwner;
    }

    public Person getOwner() {
        return owner;
    }

    // 입금 메소드
    // 파라미터 : 입금할 액수 (정수)
    // 리턴값 : 성공여부 (불린)

    boolean deposit(int amount) {
        if ((amount < 0) || (owner.getCashAmount() < amount)){
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        } else {
            owner.setCashAmount(owner.getCashAmount() - amount);
            balance += amount;
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }

    // 출금 메소드
    // 파라미터 : 출금할 액수 (정수)
    // 리턴값 : 성공여부 (불린)

    boolean withdraw(int amount) {
        if ((amount < 0) || (balance < amount)) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        } else {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        }


    }

    //계좌 이체 메소드
    // 첫번째 파라미터 : 받는 사람 (Person)
    // 두번쨰 파라미터 : 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)

//    boolean transfer(Person, int amount) {

//    }
}
