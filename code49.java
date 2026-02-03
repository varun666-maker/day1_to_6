// Interface OnlinePayment
interface OnlinePayment {
    void processPayment(double amount);
}

// Class Paytm implementing OnlinePayment
class Paytm implements OnlinePayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " via Paytm");
    }
}

// Class GooglePay implementing OnlinePayment
class GooglePay implements OnlinePayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " via GooglePay");
    }
}

// Main class named code49
public class code49 {
    public static void main(String[] args) {
        // Parent reference
        OnlinePayment payment1 = new Paytm();
        OnlinePayment payment2 = new GooglePay();

        // Call method using parent reference
        payment1.processPayment(150.50);
        payment2.processPayment(300.00);
    }
}
