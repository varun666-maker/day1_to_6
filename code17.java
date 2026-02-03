class code17 {
    private double price;
    private int stock;

    // Setter for price with validation
    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
            System.out.println("Price set to: $" + price);
        } else {
            System.out.println("Invalid price! Must be positive.");
        }
    }

    // Setter for stock with validation
    void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
            System.out.println("Stock set to: " + stock + " units");
        } else {
            System.out.println("Invalid stock! Cannot be negative.");
        }
    }

    // Getter for price
    double getPrice() {
        return price;
    }

    // Getter for stock
    int getStock() {
        return stock;
    }

    // Main method
    public static void main(String[] args) {
        code17 product = new code17();

        product.setPrice(150.50);   // Valid
        product.setPrice(-20);      // Invalid

        product.setStock(30);       // Valid
        product.setStock(-5);       // Invalid

        System.out.println("Final Price: $" + product.getPrice());
        System.out.println("Final Stock: " + product.getStock() + " units");
    }
}
