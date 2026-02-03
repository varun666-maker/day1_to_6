class code8 {
    double balance;

    // Constructor
    code8(double balance) {
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
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

    // Check balance method
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to simulate ATM operations
    public static void main(String[] args) {
        code8 atm = new code8(1000);

        atm.checkBalance();
        atm.deposit(500);
        atm.checkBalance();
        atm.withdraw(300);
        atm.checkBalance();
    }
}
