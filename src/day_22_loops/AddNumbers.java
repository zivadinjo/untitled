package day_22_loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 1;
        int total = 0;

        while (number <= 5) {
            System.out.println("Enter number " + number);
            number++;
            total += input.nextInt();

        }
        System.out.println("Total value: "+ total);


    }
}
