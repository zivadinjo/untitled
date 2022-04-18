package day_13_if_multibranch;

public class Diver {
    public static void main(String[] args) {

        int oxygenLevel = 50;

        if (oxygenLevel > 90) {
            System.out.println("Your tank is full");
        } else if (oxygenLevel > 80) {
            System.out.println("Still ok");
        } else if (oxygenLevel > 70) {
            System.out.println("Dont go to far");
        } else if (oxygenLevel > 60) {
            System.out.println("Start to head back.");
        } else if (oxygenLevel > 50) {
            System.out.println("Be careful now,you at 50%");
        } else {
            System.out.println("Dangerous");
        }
        System.out.println("-----------------------------");

        String message;

        if (oxygenLevel > 90) {
            message = "Your tank is full";
        } else if (oxygenLevel > 80) {
            message = "Still ok";
        } else if (oxygenLevel > 70) {
            message = "Dont go to far";
        } else if (oxygenLevel > 60) {
            message = "Start to head back.";
        } else if (oxygenLevel > 50) {
            message = "Be careful now,you at 50%";
        } else {
            message = "Dangerous";
        }
        System.out.println(message);


    }
}
