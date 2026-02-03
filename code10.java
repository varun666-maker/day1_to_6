class code10 {
    String collegeName;
    String location;

    // Constructor
    code10(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }

    // Method to display college details
    void displayDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
        System.out.println("----------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Create objects
        code10 college1 = new code10("ABC College", "New York");
        code10 college2 = new code10("XYZ Institute", "California");
        code10 college3 = new code10("PQR University", "Texas");

        // Print details
        college1.displayDetails();
        college2.displayDetails();
        college3.displayDetails();
    }
}
