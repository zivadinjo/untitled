package day_15_switch_statements;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which size of drink you want: ");
        String size = input.nextLine();
        double price = 0;
        int calories = 0;
        boolean validOrder = true;// hardcoded true I pick that all orders are valid,when I have an invalid rder I will change to false


        switch (size) {
            case "Tall":
                price = 2.50;
                calories = 100;
                break;
            case "Grande":
                price = 3.00;
                calories = 150;
                break;
            case "Venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("Not availible on in that size.");
                validOrder = false;

        }
         if(validOrder) {
             System.out.println("Your order for a " + size + " coffe is $" + price + " and has " + calories + " calories.");
         }


    }
}
