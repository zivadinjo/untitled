package day_55_polymorphism.interface_methods;

public class MacBookPro implements Mac{

    @Override
    public void turnOn() {
        System.out.println("MAC is turning on");
    }
}

class Runner {
    public static void main(String[] args) {

        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
//        System.out.println(MacBookPro.NAME);
//        System.out.println(MacBookPro.OS);
//        -> You can access the static variable from child class reference ,but tou should use interface access

        Mac.company(); // static method that has implementation
        //Mac.faceTime(); -> not valid need object,not static method (default method)

        //Mac.turnOn(); -> not valid need an object

        MacBookPro obj = new MacBookPro();
        obj.turnOn();
        obj.faceTime();
        //obj.company(); -> static method from interface are not inherited, so they cannot be accessed from objects



    }
}
