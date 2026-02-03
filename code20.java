class code20 {
    private int age;

    // Setter with validation
    void setAge(int age) {
        if (age > 0) {
            this.age = age;
            System.out.println("Age set to: " + age);
        } else {
            System.out.println("Invalid age! Age must be positive.");
        }
    }

    // Check voting eligibility
    boolean isEligible() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // Main method
    public static void main(String[] args) {
        code20 voter1 = new code20();
        voter1.setAge(20);
        System.out.println("Eligible to vote? " + voter1.isEligible());

        code20 voter2 = new code20();
        voter2.setAge(15);
        System.out.println("Eligible to vote? " + voter2.isEligible());

        code20 voter3 = new code20();
        voter3.setAge(-5); // Invalid age
        System.out.println("Eligible to vote? " + voter3.isEligible());
    }
}
