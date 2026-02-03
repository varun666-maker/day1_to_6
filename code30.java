// Parent class
class Appliance {
    int powerRating; // in watts

    // Constructor
    Appliance(int powerRating) {
        this.powerRating = powerRating;
    }

    // Parent method
    void turnOn() {
        System.out.println("Appliance is turned ON. Power Rating: " + powerRating + "W");
    }
}

// Child class
class WashingMachine extends Appliance {

    // Constructor
    WashingMachine(int powerRating) {
        super(powerRating); // Call parent constructor
    }

    // Child-specific method
    void washClothes() {
        System.out.println("Washing machine is washing clothes...");
    }
}

// Main class named code30
public class code30 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine(2000);

        // Call parent method
        wm.turnOn();

        // Call child method
        wm.washClothes();
    }
}
