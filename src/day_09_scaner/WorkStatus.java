package day_09_scaner;

import java.util.Scanner;

public class WorkStatus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String name = input.next();
        System.out.println("Enter last name: ");
        String lastName = input.next();
        System.out.println("Are you employed?");
        boolean employed = input.nextBoolean();
        System.out.println("Are you student");
        boolean student = input.nextBoolean();

        String details = name +" "+lastName+" is emplyed "+employed+" and he is student "+student;
        System.out.println(details);



    }

}
