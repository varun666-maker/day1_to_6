public class code3 {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: " + price);
    }

    public static void main(String[] args) {
        code3 car = new code3();
        car.brand = "Toyota";
        car.model = "Innova";
        car.price = 2500000;

        car.displayDetails();
    }
}
