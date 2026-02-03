// Main class
public class code34 {

    // Method 1: Calculate salary with basic only
    double calculateSalary(double basic) {
        return basic; // Salary = basic
    }

    // Method 2: Calculate salary with basic + bonus
    double calculateSalary(double basic, double bonus) {
        return basic + bonus; // Salary = basic + bonus
    }

    public static void main(String[] args) {
        code34 emp = new code34();

        double salary1 = emp.calculateSalary(5000);          // Only basic
        double salary2 = emp.calculateSalary(5000, 1500);    // Basic + bonus

        System.out.println("Salary with basic only: $" + salary1);
        System.out.println("Salary with basic + bonus: $" + salary2);
    }
}
