// Base class
class Account {
    String accountNumber;

    // Constructor
    Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Method to display account info
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
    }
}

// Derived class
class LoanAccount extends Account {
    double loanAmount;
    double interestRate; // Annual interest rate in %

    // Constructor
    LoanAccount(String accountNumber, double loanAmount, double interestRate) {
        super(accountNumber); // Call base class constructor
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    // Method to calculate simple EMI for 1 year
    void calculateEMI() {
        // Simple formula: EMI = (loanAmount + interest) / 12 months
        double interest = loanAmount * interestRate / 100;
        double emi = (loanAmount + interest) / 12;
        System.out.println("Loan Amount: $" + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Monthly EMI: $" + emi);
    }
}

// Main class named code29
public class code29 {
    public static void main(String[] args) {
        LoanAccount loanAcc = new LoanAccount("ACC12345", 12000, 10);

        loanAcc.displayAccount(); // From base class
        loanAcc.calculateEMI();   // From derived class
    }
}
