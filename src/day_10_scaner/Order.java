package day_10_scaner;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter product name: ");
        String product = input.nextLine();


        System.out.println("Please enter the price: $"+" "+ product);
        double price = input.nextDouble();

        System.out.println("Please enter quantity: ");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Please enter your full name: ");
        String fullName = input.nextLine();

        double totalCost = price * quantity;

        String order = fullName+" your order for "+ quantity+" "+ product+" has been placed. Your total is: $" + totalCost;

        System.out.println(order);


    }
}
