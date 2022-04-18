package day_16_review;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What was the grade?");
        int grade = input.nextInt();
        System.out.println("Which attempt number is it?");
        int attemptNum = input.nextInt();

        boolean validAttempt = attemptNum < 4 && attemptNum > 0 ;

        if (attemptNum == 1) {
            grade = grade - (int) (grade * 0.1);
        } else if (attemptNum == 2) {
            grade -= grade * 0.2;
        } else if (attemptNum == 3) {
            grade *= 0.65;
        } else {
            System.out.println("Invalid number");
        }
        if(validAttempt) {
            System.out.println(grade);
        }
    }
}
