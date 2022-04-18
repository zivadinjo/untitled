package day_28_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String cityOne = "Chicago";
        String cityTwo = "New York";
        String cityThree  = "Houston";
        String cityFour = "Denver";
        String cityFive = "Pittsburgh";



        String [] cities = { "Chicago" , "New York", "Houston" , "Denver" , "Pittsburgh" };

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        // print all cities in one line
        System.out.println("Reverse order of cities " + cities[4] + " , " +cities[3]+" , " + cities[2]+ " , " + cities[1]+ " , " + cities[0]);

        // print the array all in one time

        System.out.println(Arrays.toString(cities));

        // number of elements

        System.out.println(cities.length);



    }
}
