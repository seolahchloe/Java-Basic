package ObjectOrientedProgramming;

public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge; // 새로운 값이 양수일 때만 private 변수에 값을 넣어준다.
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setCashAmount(int newCashAmount) {
        if (newCashAmount >= 0) {
            cashAmount = newCashAmount;
        }
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setAccount(BankAccount newAccount) {
        account = new BankAccount();
    }

    public BankAccount getAccount() {
        return account;
    }
}
