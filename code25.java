// Base class
class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Derived class 1
class Developer extends Employee {
    // Constructor
    Developer(String name, double salary) {
        super(name, salary);
    }

    // Developer-specific method
    void code() {
        System.out.println(name + " is coding.");
    }
}

// Derived class 2
class Manager extends Employee {
    // Constructor
    Manager(String name, double salary) {
        super(name, salary);
    }

    // Manager-specific method
    void manageTeam() {
        System.out.println(name + " is managing the team.");
    }
}

// Main class named code25
public class code25 {
    public static void main(String[] args) {
        Developer dev = new Developer("Alice", 80000);
        Manager mgr = new Manager("Bob", 100000);

        System.out.println("Developer Details:");
        dev.displayDetails();
        dev.code();

        System.out.println("\nManager Details:");
        mgr.displayDetails();
        mgr.manageTeam();
    }
}
