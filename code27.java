// Parent class
class ElectronicDevice {
    String brand;

    // Constructor
    ElectronicDevice(String brand) {
        this.brand = brand;
    }

    // Parent method
    void powerOn() {
        System.out.println(brand + " device is powered ON.");
    }
}

// Child class
class Laptop extends ElectronicDevice {
    int ramSize; // in GB

    // Constructor
    Laptop(String brand, int ramSize) {
        super(brand); // Call parent constructor
        this.ramSize = ramSize;
    }

    // Child method
    void showSpecs() {
        System.out.println("Laptop RAM Size: " + ramSize + " GB");
    }
}

// Main class named code27
public class code27 {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", 16);

        // Call parent method
        myLaptop.powerOn();

        // Call child method
        myLaptop.showSpecs();
    }
}
