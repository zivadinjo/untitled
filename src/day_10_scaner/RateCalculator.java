package day_10_scaner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your salary: ");
        double salary = input.nextDouble();

        System.out.println("Please enter work hours: ");
        int hour = input.nextInt();

        double hourRate = salary / (hour * 52);

        System.out.println("With the salary $"+ salary+" and working for "+ hour+ " hours, hourly rate is "+ hourRate);

    }
}
