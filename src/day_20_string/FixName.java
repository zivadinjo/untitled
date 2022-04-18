package day_20_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = input.nextLine();
        System.out.println("Please enter last name:");
        String lastName = input.nextLine();

        firstName = firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();


        String fixedFirst = firstName.substring(0, 1).toUpperCase();// First letter will be uppercase
        fixedFirst += firstName.substring(1);// adds last of name to the first uppercase letter


        String fixedLast = lastName.substring(0, 1).toUpperCase() +lastName.substring(1) ;

        System.out.println(fixedFirst + " " + fixedLast);


    }
}
