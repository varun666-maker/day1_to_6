// Interface Remote
interface Remote {
    void turnOn();
    void turnOff();
}

// Class TV implementing Remote
class TV implements Remote {
    @Override
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

// Class AC implementing Remote
class AC implements Remote {
    @Override
    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

// Main class named code46
public class code46 {
    public static void main(String[] args) {
        Remote device1 = new TV();
        Remote device2 = new AC();

        device1.turnOn();
        device1.turnOff();

        device2.turnOn();
        device2.turnOff();
    }
}
