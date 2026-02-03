// Main class
public class code31 {

    // Method 1: add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method 3: add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        code31 calc = new code31();

        // Using overloaded methods
        int sum1 = calc.add(10, 20);
        double sum2 = calc.add(5.5, 4.5);
        int sum3 = calc.add(1, 2, 3);

        // Print results
        System.out.println("Sum of 2 integers: " + sum1);
        System.out.println("Sum of 2 doubles: " + sum2);
        System.out.println("Sum of 3 integers: " + sum3);
    }
}
