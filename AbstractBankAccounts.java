abstract class BankAccount {
    protected double balance;

    BankAccount(double openingBalance) {
        if (openingBalance < 0) throw new IllegalArgumentException("Opening balance cannot be negative.");
        this.balance = openingBalance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    double getBalance() { return balance; }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double openingBalance) { super(openingBalance); }

    @Override
    void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Savings deposit must be positive.");
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Savings withdrawal denied.");
    }
}

class CurrentAccount extends BankAccount {
    private final double overdraftLimit;

    CurrentAccount(double openingBalance, double overdraftLimit) {
        super(openingBalance);
        if (overdraftLimit < 0) throw new IllegalArgumentException("Overdraft limit cannot be negative.");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Current account deposit must be positive.");
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) balance -= amount;
        else System.out.println("Current account withdrawal denied.");
    }
}

public class AbstractBankAccounts {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000.0);
        BankAccount current = new CurrentAccount(500.0, 300.0);
        savings.deposit(250.0);
        savings.withdraw(100.0);
        current.withdraw(700.0);
        current.deposit(100.0);
        System.out.println("Savings balance: Rs. " + savings.getBalance());
        System.out.println("Current balance: Rs. " + current.getBalance());
    }
}
