class code15 {
    private int speed;

    // Setter with validation
    void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
            System.out.println("Speed set to: " + speed + " km/h");
        } else {
            System.out.println("Invalid speed! Must be between 0 and 200 km/h.");
        }
    }

    // Getter
    int getSpeed() {
        return speed;
    }

    // Main method
    public static void main(String[] args) {
        code15 car = new code15();

        car.setSpeed(150);   // Valid
        car.setSpeed(-20);   // Invalid
        car.setSpeed(250);   // Invalid

        System.out.println("Current Speed: " + car.getSpeed() + " km/h");
    }
}
