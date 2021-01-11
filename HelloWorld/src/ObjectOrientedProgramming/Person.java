package ObjectOrientedProgramming;

public class Person {
    private String name;
    private int age;
    private int cashAmount; // 현금 보유량
    private BankAccount account;

    public Person(String name) {
        this(name, 12, 0);
    }

    public Person(String name, int age) {
        this(name, age, 0);
    }

    public Person(String name, int age, int cashAmount) {
        if (age < 0) {
            this.age = 12;
        }else{
            this.age = age;
        }
        if (cashAmount < 0) {
            this.cashAmount = 0;
        } else {
            this.cashAmount = cashAmount;
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCashAmount(int cashAmount) {
        if (cashAmount >= 0) {
            this.cashAmount = cashAmount;
        }
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
}
