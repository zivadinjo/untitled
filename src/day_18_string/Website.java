package day_18_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String website = input.nextLine();
        website = website.toLowerCase();

        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");


        if (validStart && validEnd) {
            System.out.println("Enter to " + website);
        } else {
            if (!validStart) {
                System.out.println("Website need to start with www.");
            }
            if (!validEnd) {
                System.out.println("Website need to end with .com or .gov or .edu or .net");
            }
        }


    }
}
