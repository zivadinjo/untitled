package day_15_switch_statements;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day: ");
        String day = input.nextLine();
        String information = "";


        switch (day) {
            case "mon":
            case "Monday":
            case "monday":
                information = "Java clas with Saim, from 6pm";
                break;
            case "Tuesday":
            case "tuesday":
            case "Wednesday":
            case "wednesday":
                information = "Java clas with Saim, from 6pm,and office hours from 4:30 with Mehmet";
                break;
            case "Thursday":
            case "thursday":
                information = "Soft skills with Nadir, from 6pm";
                break;
            case "Friday":
            case "friday":
                information = "Day off,bu Nadir says soft skills studying day";
                break;
            case "Saturday":
            case "Sunday":
                information = "Java clas with Saim, from 9am to 4pm";
                break;
            default:
                information = "Wrong input";

        }
        System.out.println(information);


    }
}
