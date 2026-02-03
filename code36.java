// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class named code36
public class code36 {
    public static void main(String[] args) {
        // Parent reference, child object
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Calls Dog's overridden method
        a2.sound(); // Calls Cat's overridden method

        // Optional: Parent object
        Animal a3 = new Animal();
        a3.sound(); // Calls parent method
    }
}
