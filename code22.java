// Base class
class Vehicle {
    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

// Derived class
class Car extends Vehicle {
    String fuelType;

    // Constructor with constructor chaining
    Car(String brand, int speed, String fuelType) {
        super(brand, speed); // Call Vehicle constructor
        this.fuelType = fuelType;
    }

    // Method to display full details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("---------------------");
    }
}

// Main class named code22
public class code22 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 180, "Petrol");
        Car car2 = new Car("Tesla", 250, "Electric");

        car1.displayDetails();
        car2.displayDetails();
    }
}
