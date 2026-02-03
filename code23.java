// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class from Dog (multilevel inheritance)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Main class named code23
public class code23 {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();

        // Accessing methods from all levels
        puppy.eat();   // From Animal
        puppy.bark();  // From Dog
        puppy.weep();  // From Puppy
    }
}
