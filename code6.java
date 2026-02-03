class code6 {
    double radius;

    // Constructor
    code6(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Main method
    public static void main(String[] args) {
        // Create object
        code6 circle = new code6(7);

        // Print area
        circle.calculateArea();
    }
}
