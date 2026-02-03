// Abstract parent class
abstract class Shape {
    // Abstract method
    abstract double area();

    // Normal method
    void display() {
        System.out.println("This is a shape.");
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
        return Math.PI * radius * radius;
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
        return length * width;
    }
}

// Main class named code41
public class code41 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.display();
        System.out.println("Area of Circle: " + s1.area());

        s2.display();
        System.out.println("Area of Rectangle: " + s2.area());
    }
}
