package day_33_methods;

public class Car {

    public static void unlockTheCar(){
        System.out.println("Unlocking the car");
    }
    public static void openDoor(){
        System.out.println("Open the door");
    }
    public static void sitInCar(){
        System.out.println("Sitting in the car");
        System.out.println("Close the door");
    }
    public static void getReadyToGo(){
        System.out.println("Put seatbelt on");
        System.out.println("Check mirrors");
        System.out.println("Put music on");
        System.out.println("Check navigation");
    }
    public static void startCar(){
        System.out.println("Starting car");
    }
    public static void driveAndGo(){
        System.out.println("Puting car in to drive");
        System.out.println("Going forward");
    }
    public static void inHurry(){
        unlockTheCar();
        sitInCar();
        startCar();
        driveAndGo();
    }

    public static void main (String [] args){
        unlockTheCar();
        unlockTheCar();
        openDoor();
        sitInCar();
        getReadyToGo();
        startCar();
        driveAndGo();

        System.out.println();

        inHurry();
        System.out.println("Hear police siren");
        getReadyToGo();


    }



}
