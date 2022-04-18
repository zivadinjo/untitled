package day_22_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to ATM");

        int validPin = 1234;
        int userPIN;
        int attempts = 0;

        do {
            System.out.println("Enter your PIN: ");
            userPIN = input.nextInt();
            attempts++;

        } while (attempts < 3 && validPin != userPIN);

        if (validPin == userPIN) {
            System.out.println("Looged in");
        }else{
            System.out.println("Locked out");
        }


    }
}
