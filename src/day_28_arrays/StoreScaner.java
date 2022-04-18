package day_28_arrays;

import java.util.Scanner;

public class StoreScaner {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter item to check for");
        String check = input.nextLine();
        boolean inStock = false;

        for (int i = 0; i < items.length;i++){
            if(items[i].equalsIgnoreCase(check)) {
                System.out.println("We have " + check);
                inStock = true;
                break;
            }
        }
        if (!inStock){
            System.out.println("Out of "+ check);
        }




    }
}
