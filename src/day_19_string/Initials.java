package day_19_string;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName= input.nextLine().toUpperCase();

        System.out.println("Enter last name: ");
        String lastName = input.nextLine().toUpperCase();

        System.out.println("" + firstName.charAt(0)+ lastName.charAt(0));

        System.out.println(firstName.charAt(0));
        System.out.println(lastName.charAt(0));
        /*
        1)
        firstName = firstName.toUpperCase();
        char firstLetter = firstName.charAt(0);

        2)
        char firstLetter = firstName.toUpperCase().charAt(0);

        */

    }
}
