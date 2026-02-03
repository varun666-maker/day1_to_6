// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Child class 1
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with key ignition");
    }
}

// Child class 2
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with kick start");
    }
}

// Main class named code40
public class code40 {
    public static void main(String[] args) {
        // Polymorphic array of vehicles
        Vehicle[] vehicles = { new Car(), new Bike() };

        // Loop through array and call start()
        for (Vehicle v : vehicles) {
            v.start(); // Calls the overridden method at runtime
        }
    }
}
