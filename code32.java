// Main class
public class code32 {

    // Calculate area of square
    int area(int side) {
        return side * side;
    }

    // Calculate area of rectangle
    int area(int length, int breadth) {
        return length * breadth;
    }

    // Calculate area of circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        code32 shape = new code32();

        int squareArea = shape.area(5);           // Square with side 5
        int rectangleArea = shape.area(4, 6);     // Rectangle 4x6
        double circleArea = shape.area(3.0);      // Circle with radius 3.0

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
