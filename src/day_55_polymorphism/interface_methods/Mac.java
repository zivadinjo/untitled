package day_55_polymorphism.interface_methods;

public interface Mac {

    String NAME = "MAC"; //public static final variables ,uppercase because they are static and final
    String OS = "IOS";

    void turnOn(); // public abstract method,method without implementation

    //Q: How do you create a method with implementation in an interface

    //One way is static method

    public static void company(){
        System.out.println("Apple");
        System.out.println("HQ is in LA");
        System.out.println("New release in November");
    }

    //One way is default method

    public default void faceTime(){
        System.out.println("Opening facetime");
        System.out.println("Calling someone");
    }


}
