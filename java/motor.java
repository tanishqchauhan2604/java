// Interface Motor
interface Motor {
    int capacity = 5; // Interface data member

    void run(); // Method to run the motor
    void consume(); // Method to consume energy
}

// Class WashingMachine implementing the Motor interface
class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("Washing machine is running.");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine is consuming energy.");
    }
}

// Main class
public class main1 {
    public static void main(String[] args) {
        // Creating an object of WashingMachine class
        WashingMachine machine = new WashingMachine();

        // Accessing the capacity data member from the interface
        System.out.println("Capacity of the motor is " + Motor.capacity);
    }
}
