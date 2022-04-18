package day_15_switch_statements;

import java.util.Scanner;

public class WendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to the wending machine. \nPlease select one of the following: \n\tDrinks\n\tSnacks\n\tGum");
        String selection = input.next();
        String item = "";


        switch (selection) {
            case "Drinks":
                System.out.println("Chose drink: \nPress a number:\n\t1)Water\n\t2)Soda\n\t3)Juice");
                int drinkNumber = input.nextInt();

                if (drinkNumber == 1) {
                    item = "Water";
                } else if (drinkNumber == 2) {
                    item = "Soda";
                } else if (drinkNumber == 3) {
                    item = "Juice";
                }
                break;
            case "Snacks":
                System.out.println("You chose Snacks:\nPress a number: \n\t4)Chips\n\t5)Cookies");
                int snackNumber = input.nextInt();

                if(snackNumber==4) {
                    item = "Chips";
                }else if (snackNumber==5){
                    item= "Cookies";
                }
                break;
            case "Gums":
                item= "Generic gum";
                break;

        }
        System.out.println("Vending . . .  "+ item);

    }
}
