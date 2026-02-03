class code5 {
    String name;
    double basicSalary;

    // Constructor
    code5(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to calculate and display gross salary
    void calculateGrossSalary() {
        double hra = basicSalary * 0.20; // 20% HRA
        double da = basicSalary * 0.10;  // 10% DA
        double grossSalary = basicSalary + hra + da;

        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }

    // Main method
    public static void main(String[] args) {
        // Create object
        code5 emp = new code5("Alice", 30000);

        // Calculate and display salary
        emp.calculateGrossSalary();
    }
}
