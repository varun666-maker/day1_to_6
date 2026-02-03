// Abstract parent class
abstract class Payment {
    // Abstract method
    abstract void pay(double amount);
}

// Child class 1: UPI payment
class UPI extends Payment {
    String upiId;

    UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI ID: " + upiId);
    }
}

// Child class 2: Credit Card payment
class CreditCard extends Payment {
    String cardNumber;

    CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}

// Main class named code44
public class code44 {
    public static void main(String[] args) {
        Payment p1 = new UPI("alice@upi");
        Payment p2 = new CreditCard("1234-5678-9876-5432");

        p1.pay(250.75); // UPI payment
        p2.pay(500.00); // Credit card payment
    }
}
