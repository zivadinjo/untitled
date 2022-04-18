package day_14_nested_if;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please eneter amount: ");
        int budget = input.nextInt();

        if (budget >= 80_000 && budget <= 100_000) {
            System.out.println("name - Hills,\naverage price - 80,000 - 100,000 \nrating - 4.0 \ngated - no \nallow pets - yes");
        } else if (budget >= 55_000 && budget <= 75_000) {
            System.out.println("name - Oaks \naverage price - 55,000 - 90,000 \nrating - 3.5 \ngated - no \nallow pets - yes \nname - Highland");
        } else if (budget >= 120_000 && budget <= 150_000) {
            System.out.println("average price - 120,000 - 150,000 \nrating - 4.5 \ngated - yes \nallow pets - no");
        } else if (budget >= 160_000 && budget <= 201_000) {
            System.out.println("name - Canyon \naverage price - 160,000 -201,000 \nrating - 4.8 \ngated - yes \nallow pets - yes");
        } else if (budget >= 300_000) {
            System.out.println("To much money for this agency.");
        } else if (budget <= 0) {
            System.out.println("This is not valid budget");
        } else {
            System.out.println("No available houses.");
        }
/*
        Scanner input = new Scanner(System.in);
        System.out.println("What is your max budget?");
        int budget = input.nextInt();

        String name = "", range = "";
        double rating = 0;
        boolean gated = false, allowPets = false;

        if (budget > 0 && budget < 300_000) {

            System.out.println("Lets see if there is no houses");

            if (budget >= 55_000 && budget <= 75_000) {
                name = "Oaks";
                range = "55,000 - 75,000";
                rating = 3.5;
                gated = false;
                allowPets = true;
            } else if (budget >= 80_000 && budget <= 100_000) {
                name = "Hills";
                range = "80,000 - 100,000";
                rating = 4.0;
                gated = false;
                allowPets = true;
            } else if (budget >= 120_000 && budget <= 150_000) {
                name = "Highland";
                range = "120,000 - 150,000";
                rating = 4.5;
                gated = true;
                allowPets = false;
            } else if (budget >= 160_000 && budget <= 201_000) {
                name = "Canyon";
                range = "160,000 - 201,000";
                rating = 4.8;
                gated = true;
                allowPets = true;
            } else {
                System.out.println("No available houses");
            }

            String ad = "Name of the neighborhood: " + name + "\nPrice range: " + range + "\nRating: " + rating;
            ad +=  "Gated: " + (gated ? "Yes" : "No"); // this means if the gated boolean is true, it will concatenate "yes" into the ad, but if the gated boolean is false it will concatenate "no" into the ad
            ad += (allowPets ? "They allow pets" : "They don't allow pets");

            System.out.println(ad);

        } else {

            if (budget <= 0) {
                System.out.println("Your budget cannot be less than or equal to 0");
            } else {
                System.out.println("Too much money for this agency");
            }

        }
*/

    }
}
