package day_47_encapsulation_modifiers;

public class UseComputer {
    public static void main(String[] args) {

        System.out.println("Hello World");

        Computer comp = new Computer("HP", 500, "Silver");

        Computer.hasBattery = false;

        System.out.println(Computer.hasBattery);

//        System.out.println(Computer.brand); CLASS NAME access NOT VALID for instance variable
        System.out.println(comp.brand); // OBJECT access IS VALID for instance variable

        System.out.println(comp.hasMemory);// YOU CAN access static members,because object comes from class,BUT IN GENERAL you want to access static members by the CLASS NAME

    }
}
