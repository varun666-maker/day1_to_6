class code14 {
    private double balance;
    private int pin;

    // Constructor
    code14(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    // Validate PIN
    boolean validatePin(int enteredPin) {
        return enteredPin == pin;
    }

    // Withdraw method
    void withdraw(int enteredPin, double amount) {
        if (!validatePin(enteredPin)) {
            System.out.println("Incorrect PIN! Withdrawal denied.");
            return;
        }

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Get balance (optional)
    double getBalance() {
        return balance;
    }

    // Main method
    public static void main(String[] args) {
        code14 atm = new code14(2000, 1234);

        // Test withdrawals
        atm.withdraw(1111, 500);   // Wrong PIN
        atm.withdraw(1234, 500);   // Correct PIN
        atm.withdraw(1234, 3000);  // Insufficient balance
    }
}
