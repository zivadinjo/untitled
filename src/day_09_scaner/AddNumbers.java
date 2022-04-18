package day_09_scaner;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter number 1 ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();
        System.out.println("Enter number 3");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("Equal to "+ sum);




    }

}
