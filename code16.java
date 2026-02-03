class code16 {
    private int batteryLevel;

    // Constructor
    code16(int batteryLevel) {
        if (batteryLevel < 0) {
            this.batteryLevel = 0;
        } else if (batteryLevel > 100) {
            this.batteryLevel = 100;
        } else {
            this.batteryLevel = batteryLevel;
        }
    }

    // Charge battery
    void charge(int amount) {
        if (amount > 0) {
            batteryLevel += amount;
            if (batteryLevel > 100) {
                batteryLevel = 100;
            }
            System.out.println("Charged: " + amount + "%. Current level: " + batteryLevel + "%");
        } else {
            System.out.println("Invalid charge amount!");
        }
    }

    // Use battery
    void use(int amount) {
        if (amount > 0) {
            batteryLevel -= amount;
            if (batteryLevel < 0) {
                batteryLevel = 0;
            }
            System.out.println("Used: " + amount + "%. Current level: " + batteryLevel + "%");
        } else {
            System.out.println("Invalid usage amount!");
        }
    }

    // Getter
    int getBatteryLevel() {
        return batteryLevel;
    }

    // Main method
    public static void main(String[] args) {
        code16 mobile = new code16(50);

        mobile.charge(30);   // 50 + 30 = 80
        mobile.use(20);      // 80 - 20 = 60
        mobile.use(100);     // 60 - 100 = 0 (cannot go below 0)
        mobile.charge(150);  // 0 + 150 = 100 (cannot go above 100)

        System.out.println("Final Battery Level: " + mobile.getBatteryLevel() + "%");
    }
}
