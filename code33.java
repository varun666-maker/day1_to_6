// Main class
public class code33 {

    // Method 1: print integer
    void print(int number) {
        System.out.println("Integer: " + number);
    }

    // Method 2: print string
    void print(String message) {
        System.out.println("Message: " + message);
    }

    // Method 3: print integer and string
    void print(int number, String message) {
        System.out.println("Integer: " + number + ", Message: " + message);
    }

    public static void main(String[] args) {
        code33 printer = new code33();

        // Calling overloaded methods
        printer.print(10);
        printer.print("Hello World");
        printer.print(25, "Test Message");
    }
}
