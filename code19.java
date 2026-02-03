class code19 {
    private double celsius;

    // Setter with validation
    void setCelsius(double value) {
        if (value >= -273.15) {
            this.celsius = value;
            System.out.println("Temperature set to: " + celsius + "°C");
        } else {
            System.out.println("Invalid temperature! Cannot be below -273.15°C.");
        }
    }

    // Getter
    double getCelsius() {
        return celsius;
    }

    // Main method
    public static void main(String[] args) {
        code19 temp = new code19();

        temp.setCelsius(25);      // Valid
        temp.setCelsius(-300);    // Invalid
        temp.setCelsius(-273.15); // Valid (absolute zero)

        System.out.println("Current Temperature: " + temp.getCelsius() + "°C");
    }
}
