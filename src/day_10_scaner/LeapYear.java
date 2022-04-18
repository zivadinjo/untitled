package day_10_scaner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter year: ");
        int num = scan.nextInt();

        boolean by4 = num % 4 == 0;
        boolean by100 = num % 100 == 0;
        boolean by400 = num % 400 != 0;

        boolean leapYear = by4 || (by100 && by400);


        System.out.println("This is Leap year: "+ leapYear);

    }
}
