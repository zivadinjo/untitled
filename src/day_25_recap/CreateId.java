package day_25_recap;

import java.util.Locale;
import java.util.Scanner;

public class CreateId {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String firstName = input.nextLine().toLowerCase();
        System.out.println("Please enter last name: ");
        String lastName = input.nextLine().toLowerCase();

        String id = firstName.substring(0, 1);

        id += lastName.substring(0, 1).toUpperCase() + lastName.substring(1, 3);

        id += firstName.length() * 2;

        System.out.println(id);



    }
}
