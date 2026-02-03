// Abstract parent class
abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    // Abstract method
    abstract double calculateSalary();
}

// Child class 1: Full-time employee
class FullTimeEmployee extends Employee {
    double basicSalary;
    double allowance;

    FullTimeEmployee(String name, double basicSalary, double allowance) {
        super(name);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return basicSalary + allowance; // Full-time salary = basic + allowance
    }
}

// Child class 2: Part-time employee
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked; // Part-time salary = hourlyRate * hoursWorked
    }
}

// Main class named code43
public class code43 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Alice", 5000, 1500);
        Employee e2 = new PartTimeEmployee("Bob", 50, 100);

        System.out.println(e1.name + "'s Salary: $" + e1.calculateSalary());
        System.out.println(e2.name + "'s Salary: $" + e2.calculateSalary());
    }
}
