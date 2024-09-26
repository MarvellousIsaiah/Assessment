package Chapter3;

public class Account {
    private String accountName;
    private double accountBalance;


    public void setName(String name) {
        accountName = name;
    }

    public String getName() {
        return accountName;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if(amount <= 0)
            throw new RuntimeException("Deposit amount must be greater than or equals");
        accountBalance = accountBalance + amount;
//        accountBaals to balance += depositAmount;
    }

    public void withdraw(double amount) {
        accountBalance = accountBalance - amount;
//        accountBalance -= amount;
    }
}
