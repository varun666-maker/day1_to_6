class code18 {
    private String title;
    private boolean isAvailable;

    // Constructor
    code18(String title) {
        this.title = title;
        this.isAvailable = true; // Book is initially available
    }

    // Borrow book
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Cannot borrow '" + title + "'. Book is already borrowed.");
        }
    }

    // Return book
    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned: " + title);
        } else {
            System.out.println("'" + title + "' was not borrowed.");
        }
    }

    // Check availability
    boolean checkAvailability() {
        return isAvailable;
    }

    // Main method
    public static void main(String[] args) {
        code18 book = new code18("Java Programming");

        book.borrowBook();    // Borrow successfully
        book.borrowBook();    // Already borrowed
        book.returnBook();    // Return successfully
        book.returnBook();    // Already returned

        System.out.println("Is the book available? " + book.checkAvailability());
    }
}
