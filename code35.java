// Main class
public class code35 {
    String name;
    int age;

    // Default constructor
    code35() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called: Name = " + name + ", Age = " + age);
    }

    // Constructor with name
    code35(String name) {
        this.name = name;
        age = 0;
        System.out.println("Constructor with name called: Name = " + name + ", Age = " + age);
    }

    // Constructor with name and age
    code35(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with name and age called: Name = " + name + ", Age = " + age);
    }

    public static void main(String[] args) {
        // Using different constructors
        code35 student1 = new code35();             // Default
        code35 student2 = new code35("Alice");      // Name only
        code35 student3 = new code35("Bob", 20);    // Name and age
    }
}
