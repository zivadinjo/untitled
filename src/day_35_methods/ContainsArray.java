package day_35_methods;

import day_18_string.Contains;

public class ContainsArray {

    /*    Contains

    Create a method that will accept an int array and an int number. Check and return if the given number is in the array.*/

    public static boolean contains (int [] nums, int element){

        for (int each : nums){
            if (each == element){
                return true;
            }
        }

        return false;

    }

}
