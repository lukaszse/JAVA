package lukaszse;

import java.net.PortUnreachableException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // ok I will write some code here, if you wan so :P

        Car auto1 = new Ferrari("Ferrari 1", 12);
        Car auto2 = new Trabant("Trampek", 2);
        Car auto3 = new Punciok("kropek", 4);

        System.out.println("\n\nCar: " + auto1.getName());
        auto1.startEngine();
        auto1.accelerate();
        auto1.toBreak();

        System.out.println("\n\nCar: " + auto2.getName());
        auto2.startEngine();
        auto2.accelerate();
        auto2.toBreak();

        System.out.println("\n\nCar:" + auto3.getName());
        auto3.startEngine();
        auto3.accelerate();
        auto3.toBreak();
    }
}
