// Parent class
class Shape {
    // Method to calculate area
    double area() {
        System.out.println("Area of generic shape");
        return 0;
    }
}

// Child class 1
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
        return result;
    }
}

// Child class 2
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
        return result;
    }
}

// Main class named code37
public class code37 {
    public static void main(String[] args) {
        // Parent reference, child object
        Shape s1 = new Circle(5);          // Circle object
        Shape s2 = new Rectangle(4, 6);   // Rectangle object

        s1.area(); // Calls Circle's overridden method
        s2.area(); // Calls Rectangle's overridden method
    }
}
