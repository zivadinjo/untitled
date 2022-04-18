package day_10_scaner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What day is today? ");
        String day = input.nextLine();

        System.out.println("Enter your first name: ");
        String name = input.next();

        System.out.println("Enter last name: ");
        String last = input.next();

        input.nextLine();// When nextLine() is after any other Scanner next input. it stores enter that you press to go to the next line(this happens only when nextLine comes after any next input),thats why we are adding empty nextLine to hold the enter and solves issue and availability to work without problem

        System.out.println("What is yor adress?");
        String address = input.nextLine();

        System.out.println("Today is: " + day);
        System.out.println("First name: " + name);
        System.out.println("Last name: " + last);
        System.out.println("Adress: " + address);
    }

}
