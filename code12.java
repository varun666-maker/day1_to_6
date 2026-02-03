class code12 {
    private String name;
    private int marks;

    // Constructor
    code12(String name) {
        this.name = name;
    }

    // Setter for marks with validation
    void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("Marks set to: " + marks);
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    // Getter for marks
    int getMarks() {
        return marks;
    }

    // Main method
    public static void main(String[] args) {
        code12 student = new code12("Alice");

        student.setMarks(85);   // Valid
        student.setMarks(120);  // Invalid
        student.setMarks(-10);  // Invalid

        System.out.println("Final Marks: " + student.getMarks());
    }
}
