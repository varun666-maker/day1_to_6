// Interface Drawable
interface Drawable {
    void draw();
}

// Class Circle implementing Drawable
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Class Triangle implementing Drawable
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Main class named code47
public class code47 {
    public static void main(String[] args) {
        Drawable d1 = new Circle();
        Drawable d2 = new Triangle();

        d1.draw(); // Calls Circle's draw()
        d2.draw(); // Calls Triangle's draw()
    }
}
