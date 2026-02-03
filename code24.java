// Parent class
class Shape {
    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Child class 1
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Child class 2
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Calculate area
    double calculateArea() {
        return length * width;
    }
}

// Main class named code24
public class code24 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 7);
        Rectangle rectangle = new Rectangle("Blue", 5, 10);

        System.out.println("Circle Details:");
        circle.displayColor();
        System.out.println("Area: " + circle.calculateArea());

        System.out.println("\nRectangle Details:");
        rectangle.displayColor();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
