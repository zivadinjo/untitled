package day_47_encapsulation_modifiers;

public class Computer {

    String brand;
    double price;
    String color;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {
        System.out.println("Static block run");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    public Computer(String brand, double price, String color) {
        System.out.println("Constructor run");
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}
