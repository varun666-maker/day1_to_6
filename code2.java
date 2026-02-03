class Rectangle {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    double area() {
        return length * width;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (length + width);
    }
}

public class code2 {
    public static void main(String[] args) {
        // Create Rectangle object
        Rectangle r1 = new Rectangle(10, 5);

        // Print results
        System.out.println("Length: " + r1.length);
        System.out.println("Width: " + r1.width);
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
    }
}
