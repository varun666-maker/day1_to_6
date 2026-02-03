// Base class
class Bank {
    double balance;

    // Constructor
    Bank(double balance) {
        this.balance = balance;
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}

// Child class 1 - SavingsAccount
class SavingsAccount extends Bank {
    double interestRate;

    SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    // Specialized method: add interest
    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}

// Child class 2 - CurrentAccount
class CurrentAccount extends Bank {
    double charges;

    CurrentAccount(double balance, double charges) {
        super(balance);
        this.charges = charges;
    }

    // Specialized method: deduct charges
    void deductCharges() {
        balance -= charges;
        System.out.println("Charges deducted: $" + charges);
    }
}

// Main class named code26
public class code26 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000, 5); // 5% interest
        CurrentAccount current = new CurrentAccount(2000, 100); // $100 charges

        System.out.println("Savings Account:");
        savings.displayBalance();
        savings.addInterest();
        savings.displayBalance();

        System.out.println("\nCurrent Account:");
        current.displayBalance();
        current.deductCharges();
        current.displayBalance();
    }
}
