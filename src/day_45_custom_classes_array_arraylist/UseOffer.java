package day_45_custom_classes_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class UseOffer {
    public static void main(String[] args) {

        Offer first = new Offer("Google", "Texas", 200000, true, 15);


        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(first); // added the first Object to Array:ist

        allOffers.add(new Offer("Amazon", "New York", 180000, true, 15));

        System.out.println(allOffers);

        Offer [] moreOffers = {
             new Offer("Apple","Chicago", 230000, false, 10),
             new Offer("Tesla","Texas",250000,false,20),
             new Offer("Facebook","Florida", 120000, true, 10)
        };// created an Array of Offer Objects

        allOffers.addAll(Arrays.asList(moreOffers)); // added the Array of Offers into the ArrayList of Offers


        allOffers.addAll(Arrays.asList(
                new Offer("Discord","Chicago", 150000,false, 13),
                new Offer("Netflix","Canada",170000,true,10)
        )); // added Offer Objects using the variation args of the asList method to add multip;e Offer Objects at the same time

        System.out.println(allOffers);
        System.out.println();

        // create ArrayList to filter allOffers

        ArrayList<Offer> salaries = new ArrayList<>(allOffers); // copy of ArrayList Offer named salaries
        salaries.removeIf(each -> each.salary < 170000);
        System.out.println("Salaries above 170,000");
        System.out.println(salaries);

        System.out.println();

        ArrayList<Offer> fullTime = new ArrayList<>(allOffers);
        fullTime.removeIf(each -> !each.isFullTime); // or each.isFullTime == false

        System.out.println("Only full time offers");
        System.out.println(fullTime);


    }
}
