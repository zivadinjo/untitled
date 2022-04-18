package day_45_custom_classes_array_arraylist;

import java.util.Arrays;

public class UsingFood {
    public static void main(String[] args) {

        Food apples = new Food("Apples");
        System.out.println(apples);

        Food chips = new Food("Chips", 2);
        System.out.println(chips);
        chips.unitPrice = 3.99;
        chips.calculatePrice();

        Food chicken = new Food("Chicken", 3, 5.99);
        System.out.println(chicken);

        apples.quantity = 10;
        apples.unitPrice = 1.99;
        apples.calculatePrice();
        System.out.println(apples);


        Food[] allFood = {apples, chips, chicken, null};
        System.out.println(allFood[2]);

        allFood[3] = new Food("Fish", 4, 3.55);
        System.out.println(allFood[3]);

        System.out.println(Arrays.toString(allFood));

//        calculate the total price of the shopping list
        System.out.println();
        double totalPriceAll = 0;

        for (Food each : allFood) {// traditional loop allFood[i] // Food is the first thing in for each loop, Food is data type of each element
            System.out.println(each);
            totalPriceAll += each.totalPrice;
        }

        System.out.println(totalPriceAll);


    }
}
