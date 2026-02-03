class code13 {
    private double salary;

    // Setter with validation
    void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Salary set to: " + salary);
        } else {
            System.out.println("Invalid salary! Salary cannot be negative.");
        }
    }

    // Getter
    double getSalary() {
        return salary;
    }

    // Main method
    public static void main(String[] args) {
        code13 emp = new code13();

        emp.setSalary(50000);   // Valid
        emp.setSalary(-1000);   // Invalid

        System.out.println("Final Salary: " + emp.getSalary());
    }
}
