// Abstract parent class
abstract class Vehicle {
    // Abstract method
    abstract void start();
}

// Child class 1: Car
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with key ignition");
    }
}

// Child class 2: Bike
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with kick start");
    }
}

// Main class named code45
public class code45 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start(); // Calls Car's overridden start()
        v2.start(); // Calls Bike's overridden start()
    }
}
