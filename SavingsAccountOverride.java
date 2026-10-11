class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = Math.max(0.0, balance);
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Deposit must be positive.");
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    double getBalance() { return balance; }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance && balance - amount >= 100.0) {
            balance -= amount;
            System.out.println("Savings withdrawal successful.");
        } else {
            System.out.println("Withdrawal denied: balance must not fall below Rs. 100.");
        }
    }
}

public class SavingsAccountOverride {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500.0);
        account.withdraw(250.0);
        account.withdraw(200.0);
        System.out.println("Balance: Rs. " + account.getBalance());
    }
}
