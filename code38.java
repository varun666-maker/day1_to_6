// Parent class
class Payment {
    void processPayment() {
        System.out.println("Processing generic payment");
    }
}

// Child class 1
class UPI extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing payment via UPI");
    }
}

// Child class 2
class CreditCard extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing payment via Credit Card");
    }
}

// Main class named code38
public class code38 {
    public static void main(String[] args) {
        // Polymorphic array
        Payment[] payments = { new UPI(), new CreditCard() };

        // Loop through array and call processPayment()
        for (Payment p : payments) {
            p.processPayment(); // Calls the overridden method at runtime
        }
    }
}
