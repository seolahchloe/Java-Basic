package ObjectOrientedProgramming;

public class BankAccount {
    private int balance;
    private Person owner;

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(Person newOwner) {
        owner = newOwner;
    }

    public Person getOwner() {
        return owner;
    }


    // 입금 메소드
    // 파라미터 : 입금할 액수amount;(정수)
    // 리턴값 : 성공 여부(불린)

    // 첫 번째 deposit 메소드
    public boolean deposit(int amount) {
        if (amount < 0 || owner.getCashAmount() < amount) {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }

        owner.setCashAmount(owner.getCashAmount() - amount);
        balance += amount;

        System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;
    }

    // 출금 메소드
    // 파라미터 : 출금할 액수amount;(정수)
    // 리턴값 : 성공 여부(불린)
    public boolean withdraw(int amount) {
        if (amount < 0 || balance < amount) {

            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
        balance -= amount;
        owner.setCashAmount(owner.getCashAmount() + amount);

        System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;
    }

    // 송금 메소드 작성 - 계좌이체
    // 첫 번째 파라미터 : 받는 사람 (BankAccount to)
    // 두 번째 파라미터 : 이체할 금액 (정수)
    // 리턴값 : 성공 여부(불린)

    public boolean transfer(BankAccount to, int amount) {
        boolean success;

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.balance += amount;
            success = true;
        }

        System.out.println(success + " - from: " + owner.getName() +
                ", to: " + to.owner.getName() +
                ", amount: " + amount +
                ", balance: " + balance);
        return success;
    }

    // 첫 번째 파라미터 : 받는 사람 (Person to)
    // 두 번째 파라미터 : 이체할 금액 (정수)
    // 리턴값 : 성공 여부(불린)
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

    public BankAccount(int balance) {
        this.balance = balance;
        if (balance < 0) {
            this.balance = 0;
        }
    }

    public BankAccount(Person owner) {
        this.owner = owner;
        owner.setAccount(this);
        balance = 0;
    }

    public BankAccount(int balance, Person owner) {
        this.balance = balance;
        this.owner = owner;
        if (balance < 0) {
            this.balance = 0;
        }
    }
}
