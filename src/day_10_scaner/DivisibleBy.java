package day_10_scaner;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scan.nextInt();

        boolean by2 = num % 2 == 0;
        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;

        System.out.println(num + " is divisible by 2: " + by2);
        System.out.println(num + " is divisible by 3: " + by3);
        System.out.println(num + " is divisible by 5: " + by5);

    }
}
