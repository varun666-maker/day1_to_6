// Parent class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate bonus
    double calculateBonus() {
        System.out.println(name + " (Employee) gets standard bonus");
        return salary * 0.05; // 5% bonus
    }
}

// Child class 1
class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        System.out.println(name + " (Developer) gets developer bonus");
        return salary * 0.10; // 10% bonus
    }
}

// Child class 2
class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        System.out.println(name + " (Manager) gets manager bonus");
        return salary * 0.15; // 15% bonus
    }
}

// Main class named code39
public class code39 {
    public static void main(String[] args) {
        // Parent references
        Employee e1 = new Developer("Alice", 80000);
        Employee e2 = new Manager("Bob", 100000);

        System.out.println("Bonus for " + e1.name + ": $" + e1.calculateBonus());
        System.out.println("Bonus for " + e2.name + ": $" + e2.calculateBonus());
    }
}
