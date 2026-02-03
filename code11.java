class code11 {
    private double balance;

    // Constructor
    code11(double balance) {
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Get balance method
    double getBalance() {
        return balance;
    }

    // Main method
    public static void main(String[] args) {
        code11 account = new code11(1000);

        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);

        System.out.println("Current Balance: " + account.getBalance());
    }
}
