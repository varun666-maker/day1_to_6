// Base class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Derived class
class Student extends Person {
    int rollNumber;
    int marks;

    // Constructor
    Student(String name, int age, int rollNumber, int marks) {
        super(name, age); // Call base class constructor
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display all details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

// Main class named code21
public class code21 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 18, 101, 95);
        Student student2 = new Student("Bob", 19, 102, 88);

        student1.displayDetails();
        student2.displayDetails();
    }
}
