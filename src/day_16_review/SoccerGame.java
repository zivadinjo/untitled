package day_16_review;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many minutes are left?");
        int minutes = input.nextInt();

        if (minutes >= 0 && minutes <= 90) {
            if (minutes >= 75) {
                System.out.println("Game just getting started.");
            } else if (minutes >= 60) {
                System.out.println("Players are doing their best");
            } else if (minutes >= 30) {
                System.out.println("Middle of the game is going great.");
            } else {
                System.out.println("The end of the game is approaching.");
            }

        } else {
            if (minutes < 0) {
                System.out.println("Minutes can not be a negative number.");
            } else {
                System.out.println("The game is over.");
            }
        }
//System.out.println( minutes < 0 ? "Minutes can not be a negative number." : "The game is over."); ternary

    }


}
