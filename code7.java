class code7 {
    String title;
    String author;
    double price;

    // Constructor
    code7(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("---------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Create book objects
        code7 book1 = new code7("Java Basics", "James Gosling", 450);
        code7 book2 = new code7("Python Essentials", "Guido van Rossum", 500);
        code7 book3 = new code7("C Programming", "Dennis Ritchie", 400);

        // Display all book details
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
