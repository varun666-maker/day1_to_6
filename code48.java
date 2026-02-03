// Interface BankService
interface BankService {
    void deposit(double amount);
    void withdraw(double amount);
}

// Class SavingsAccount implementing BankService
class SavingsAccount implements BankService {
    private double balance;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to SavingsAccount. New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from SavingsAccount. New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance in SavingsAccount");
        }
    }
}

// Class CurrentAccount implementing BankService
class CurrentAccount implements BankService {
    private double balance;

    CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to CurrentAccount. New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from CurrentAccount. New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance in CurrentAccount");
        }
    }
}

// Main class named code48
public class code48 {
    public static void main(String[] args) {
        BankService sAccount = new SavingsAccount(1000);
        BankService cAccount = new CurrentAccount(500);

        sAccount.deposit(500);
        sAccount.withdraw(300);

        cAccount.deposit(200);
        cAccount.withdraw(800); // Should show insufficient balance
    }
}
