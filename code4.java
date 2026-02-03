class code4 {
    String accountHolderName;
    double balance;

    // Constructor
    code4(String name, double bal) {
        accountHolderName = name;
        balance = bal;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create object
        code4 account = new code4("John Doe", 1000);

        // Perform operations
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);
    }
}
