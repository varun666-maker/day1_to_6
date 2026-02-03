// Parent class
class Teacher {
    String name;

    // Constructor
    Teacher(String name) {
        this.name = name;
    }

    // Parent method
    void teach() {
        System.out.println(name + " is teaching.");
    }
}

// Child class 1
class MathTeacher extends Teacher {

    MathTeacher(String name) {
        super(name);
    }

    // Specialized method
    void solveEquation() {
        System.out.println(name + " is solving math equations.");
    }
}

// Child class 2
class ScienceTeacher extends Teacher {

    ScienceTeacher(String name) {
        super(name);
    }

    // Specialized method
    void conductExperiment() {
        System.out.println(name + " is conducting a science experiment.");
    }
}

// Main class named code28
public class code28 {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher("Alice");
        ScienceTeacher scienceTeacher = new ScienceTeacher("Bob");

        // MathTeacher methods
        mathTeacher.teach();          // Parent method
        mathTeacher.solveEquation();  // Child method

        System.out.println();

        // ScienceTeacher methods
        scienceTeacher.teach();           // Parent method
        scienceTeacher.conductExperiment(); // Child method
    }
}
