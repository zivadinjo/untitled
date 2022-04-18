package day_10_scaner;

import java.util.Scanner;

public class Appartament {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Address: ");
        String address = input.nextLine();

        System.out.println("Full name: ");
        String fullName = input.nextLine();

        System.out.println("Number of units: ");
        int numberOfUnits = input.nextInt();

        System.out.println("Average size of unit: ");
        double sizeOfUnit = input.nextDouble();

        System.out.println("Monthly rent: $");
        int rent = input.nextInt();

        System.out.println("Number of washers and dryers: ");
        int washerDryer = input.nextInt();

        System.out.println("Pets allowed: ");
        boolean arePetsAllowed = input.nextBoolean();

        System.out.println("Has pool: ");
        boolean hasPool = input.nextBoolean();

        System.out.println("Length of lease: ");
        int length = input.nextInt();

        System.out.println("Total number of residents: ");
        int numberOfResidents = input.nextInt();

        input.nextLine();

        System.out.println("Phone number: ");
        String phoneNumber = input.nextLine();


        System.out.println("Is gas station near: ");
        boolean gasStation = input.nextBoolean();

        System.out.println("Number of floors: ");
        int floorNumber = input.nextInt();

        System.out.println("Has basement: ");
        boolean hasBasement = input.nextBoolean();

        System.out.println("Has ait condition: ");
        boolean hasAirCondition = input.nextBoolean();

        System.out.println("Number of parking spaces: ");
        int parkingSpotsNumber = input.nextInt();

        System.out.println("Has wheel chair access: ");
        boolean hasWheelChairAcc = input.nextBoolean();


        System.out.println("Number of review stars: ");
        double numberOfStars = input.nextDouble();

        double monthlyRent3y= rent * 0.9;
        double monthlyRent6y = rent * 0.8;
        double averageNumberOfResidents = numberOfResidents / numberOfUnits;
        double averageNumberOfSpots = parkingSpotsNumber / numberOfUnits;
        double averageNumberOfUnitsPerFloor = numberOfUnits / floorNumber;

        System.out.println(monthlyRent3y);
        System.out.println(monthlyRent6y);
        System.out.println(averageNumberOfResidents);
        System.out.println(averageNumberOfSpots);
        System.out.println(averageNumberOfUnitsPerFloor);




    }

}
