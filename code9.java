class code9 {
    String brand;
    int batteryPercentage;

    // Constructor
    code9(String brand, int batteryPercentage) {
        this.brand = brand;
        this.batteryPercentage = batteryPercentage;
    }

    // Charge battery
    void charge(int percent) {
        if (percent > 0) {
            batteryPercentage += percent;
            if (batteryPercentage > 100) {
                batteryPercentage = 100;
            }
            System.out.println("Battery charged. Current level: " + batteryPercentage + "%");
        }
    }

    // Use battery
    void useBattery(int percent) {
        if (percent > 0) {
            batteryPercentage -= percent;
            if (batteryPercentage < 0) {
                batteryPercentage = 0;
            }
            System.out.println("Battery used. Current level: " + batteryPercentage + "%");
        }
    }

    // Main method
    public static void main(String[] args) {
        code9 mobile = new code9("Samsung", 50);

        mobile.charge(40);
        mobile.useBattery(30);
        mobile.useBattery(80);
        mobile.charge(60);
    }
}
