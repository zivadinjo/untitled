package day_14_nested_if;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter PIN code: ");
        int pin = input.nextInt();
        System.out.println("PLease enter last four of SSN: ");
        int ssn = input.nextInt();

        int expectedPIN = 1552;
        int expectedSSN = 1234;

        if (expectedPIN == pin && expectedSSN == ssn) {
            System.out.println("Autentication succsesuful");
        } else{
            System.out.println("Autentication failed");

            if (expectedPIN != pin) {
                System.out.println("Incorect PIN");
            }
            if (ssn != expectedSSN) {
                System.out.println("Invalid SSN");
            }

        }

/*import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter PIN code: ");
        int pin = input.nextInt();
        System.out.println("PLease enter last four of SSN: ");
        int ssn = input.nextInt();

        int expectedPIN = 1552;
        int expectedSSN = 1234;

        boolean validPIN = expectedPIN == pin;
        boolean validSSN = expectedSSN == ssn;

        if (validPIN && validSSN) {
            System.out.println("Autentication succsesuful");
        } else {
            System.out.println("Autentication failed");

            if (validPIN) {
                System.out.println("Incorect PIN");
            }
            if (validSSN) {
                System.out.println("Invalid SSN");
            }

        }


    }*/
    }
}
