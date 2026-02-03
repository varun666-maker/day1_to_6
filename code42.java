// Abstract parent class
abstract class Animal {
    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating");
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

// Main class named code42
public class code42 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.eat();   // Normal method from parent
        a1.sound(); // Overridden method

        a2.eat();   // Normal method from parent
        a2.sound(); // Overridden method
    }
}
